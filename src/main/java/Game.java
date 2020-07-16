import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Game extends JPanel implements KeyListener {

    Ball ball = new Ball(this);
    Racquet racquet = new Racquet(this);

    public void move(){
        ball.moveBall();
        racquet.moveRacquet();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //clears the screen and then paints
        Graphics2D g2d = (Graphics2D) g;
        //g2d.setColor(Color.BLUE);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); //makes the rendered objects' borders smoother
        ball.paint(g2d);
        racquet.paint(g2d);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        racquet.keyPressed(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        racquet.keyReleased(keyEvent);
    }
}
