import java.awt.*;


public class Ball {

    private int x = 0, y = 0, xSpeed = 1, ySpeed = 1;
    private int ballDiameter = 30;
    private Game game;

    public Ball(Game game){
        this.game = game;
    }

    public void moveBall(){
        if (x + xSpeed < 0)
            xSpeed = 1;
        if (x + xSpeed > game.getWidth() - ballDiameter)
            xSpeed = -1;
        if (y + ySpeed < 0)
            ySpeed = 1;
        if (y + ySpeed > game.getHeight() - ballDiameter)
            ySpeed = -1;

        x = x + xSpeed;
        y = y + ySpeed;
    }

    public void paint(Graphics g2d) {
        g2d.fillOval(x, y, ballDiameter, ballDiameter);
    }
}
