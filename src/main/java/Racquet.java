import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Racquet {
    private int x = 0, xSpeed = 0;
    private int rectHeight = 30, rectWidth = 100;
    private Game game;

    public Racquet(Game game){
        this.game = game;
    }

    public void moveRacquet(){
        if (x + xSpeed > 0 && x + xSpeed < game.getWidth() - rectWidth)
            x = x + xSpeed;
    }

    public void keyReleased(KeyEvent e) {
        xSpeed = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xSpeed = -1;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xSpeed = 1;
    }

    public void paint(Graphics g2d) {
        int y = game.getHeight() - rectHeight;
        g2d.fillRect(x, y, rectWidth, rectHeight);
    }
}
