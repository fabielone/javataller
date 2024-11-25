import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;


public class Server {
    final List<ObjectOutputStream> clientOutputStreams = new ArrayList<>();

    public static void main(String[] args) {
        new Server().go();
    }

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            ExecutorService threadPool = Executors.newCachedThreadPool();

          while(!serverSock.isClosed()){
            Socket clientSocket = serverSock.accept();
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
            clientOutputStreams.add(out);

            ClientHandler handler = new ClientHandler(clientSocket);
            threadPool.submit(handler);
            System.out.println("got a connection");
          }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    public void tellEveryone(Object one, Object two) {
      for(ObjectOutputStream out : clientOutputStreams){
        try {
          out.writeObject(one);
          out.writeObject(two);
        } catch (Exception ex) {
          ex.printStackTrace();
    }
    }
    }

    public class ClientHandler implements Runnable {
        private ObjectInputStream in;
        private Socket clientSocket;

        public ClientHandler(Socket socket) {
            try {
                clientSocket = socket;
                in = new ObjectInputStream(clientSocket.getInputStream());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void run() {
            Object o2 = null;
            Object o1 = null;
            try {
                while ((o1 = in.readObject()) != null) {
                    o2 = in.readObject();
                    System.out.println("read two objects");
                    tellEveryone(o1, o2);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        }



    }



