import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class GUI{
    private JFrame frame;
    private JPanel panel;
    private Game game;

    public GUI() throws InterruptedException {
        frame = new JFrame();
        panel = new JPanel();
        game = new Game(); //create an object of game

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER); //add panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Pong");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700,500);

        //add game and keylistener to the frame
        frame.add(game);
        frame.addKeyListener(game);

       while(true) {
            game.move();
            game.repaint();
           Thread.sleep(10);
       }
    }
}