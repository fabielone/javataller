// Escriba un programa que muestre una etiqueta, un botón, un campo de texto, 
//un área de texto y una caja de verificación, en las 5 posiciones definidas en un 
//BorderLayout. Utilice clases anidadas para manejar los eventos sobre los botones.

import java.awt.BorderLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tarea 13");
        JLabel label = new JLabel("Etiqueta");
        JButton button = new JButton("Botón");
        JTextField textField = new JTextField("Campo de texto");
        JTextArea textArea = new JTextArea("Área de texto");
        JCheckBox checkBox = new JCheckBox("Caja de verificación");

        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);
        frame.add(textField, BorderLayout.EAST);
        frame.add(textArea, BorderLayout.WEST);
        frame.add(checkBox, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

     

        

    }
}


