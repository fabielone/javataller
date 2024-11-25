// 1) Un programa que muestre un círculo relleno con un gradiente que vaya desde un color aleatorio a otro.



import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class CirculoGradiante {
    private JFrame frame;

    public static void main(String[] args){
        CirculoGradiante gui = new CirculoGradiante();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       

        MyDrawPanel drawPanel = new MyDrawPanel();

      
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
        Color startColor = new Color(red, green, blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70,70, startColor, 150,150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}