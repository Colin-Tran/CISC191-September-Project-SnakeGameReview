package edu.sdccd.cisc191.template;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
public boolean gameOver;
Button resetButton;
Button exitButton;
GamePanel game;
    GameFrame(){

        resetButton = new Button("Restart");
        resetButton.setLocation(50,200);
        resetButton.addActionListener(this);
        resetButton.setSize(100,100);

        exitButton = new Button("Exit");
        exitButton.setLocation(50,400);
        exitButton.addActionListener(this);
        exitButton.setSize(100,100);

        game = new GamePanel();

        this.add(exitButton);
        this.add(resetButton);
        this.add(game);

        this.setTitle("September Architect Assignment");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton){
            this.remove(game);
            game = new GamePanel();
            this.add(game);
            game.startGame();
            SwingUtilities.updateComponentTreeUI(this);

        }
        if(e.getSource() == exitButton){
            System.exit(0);
        }
    }
}