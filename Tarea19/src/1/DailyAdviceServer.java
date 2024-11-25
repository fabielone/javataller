import java.io.*;
import java.net.*;
import java.util.Random;

public class DailyAdviceServer {
    final private String[] adviceList = {
        "Take smaller bites",
        "Go for the tight jeans. No they do NOT make you look fat.",
        "One word: inappropriate",
        "Just for today, be honest. Tell your boss what you *really* think",
        "You might want to rethink that haircut."
    };

    private final Random random = new Random();

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while (true) {
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println(getAdvice());
                writer.close();
                System.out.println("Advice sent: " + getAdvice());
            }
        } catch (IOException e) {
            e.printStackTrace();
    
}
    }

    private String getAdvice() {
        return adviceList[random.nextInt(adviceList.length)];
    }
}

