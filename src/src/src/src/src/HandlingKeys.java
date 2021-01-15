package src.src.src;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HandlingKeys {
    private JFrame frame;

    public HandlingKeys() {
        frame = new JFrame("Frame A");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);

        frame.setFocusable(true);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                switch (e.getKeyChar()) {
                    case '1':
                        System.out.println("Player 1 - Answer A");
                        break;
                    case '2':
                        System.out.println("Player 1 - Answer B");
                        break;
                    case '3':
                        System.out.println("Player 1 - Answer C");
                        break;
                    case '4':
                        System.out.println("Player 1 - Answer D");
                    case 'm':
                        System.out.println("Player 2 - Answer A");
                        break;
                    case ',':
                        System.out.println("Player 2 - Answer B");
                        break;
                    case '.':
                        System.out.println("Player 2 - Answer C");
                        break;
                    case '/':
                        System.out.println("Player 2 - Answer D");

                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        HandlingKeys hk = new HandlingKeys();
    }
}