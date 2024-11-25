// 2) Un programa que muestre un círculo relleno de un color y un botón. Al presionar el botón el círculo debe cambiar de color. Utilice clases
// anidadas para manejar el evento sobre el botón.



import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class CirculoRelleno {
    private JFrame frame;

    public static void main(String[] args){
        CirculoRelleno gui = new CirculoRelleno();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(e -> frame.repaint());

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}


class  MyDrawPanel extends JPanel{
    public void paintComponent(Graphics graphics){
        Graphics2D g2d = (Graphics2D) graphics;

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color Color = new Color(red, green, blue);

       
        g2d.setPaint(Color);
        g2d.fillOval(70,70,100,100);
    }
}

