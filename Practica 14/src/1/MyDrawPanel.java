
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.JPanel;

class MyDrawPanel extends JPanel implements ControllerEventListener {

    private boolean msg = false;
    private Random random = new Random();

    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics graphics){
        if (msg){
           int r = random.nextInt(250);
              int gr = random.nextInt(250);
              int b = random.nextInt(250);

              graphics.setColor(new Color(r,gr,b));

              int ht = random.nextInt(120) + 10;
                int width = random.nextInt(120) + 10;

                int x = random.nextInt(40) + 10;
                int y = random.nextInt(40) + 10;

                graphics.fillRect(x,y,ht,width);
                msg = false;
        }
    }

}