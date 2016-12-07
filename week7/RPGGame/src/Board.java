import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by mozgaanna on 05/12/16.
 */
public class Board extends JComponent implements KeyListener {
    ArrayList<GameObject> gameObjects;

    Hero hero = new Hero();
    Skeleton skeleton1 = new Skeleton(7, 2);
    Skeleton skeleton2 = new Skeleton(2, 4);
    Boss boss = new Boss();
    int[][] board;

    BufferedImage upImage;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;


    public Board() {
        try {
            upImage = ImageIO.read(new File("hero-up.png"));
            downImage = ImageIO.read(new File("hero-down.png"));
            rightImage = ImageIO.read(new File("hero-right.png"));
            leftImage = ImageIO.read(new File("hero-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }



        board = new int[][]{
                {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 1, 1, 1}
        };

        gameObjects = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }
    }


    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }


        hero.draw(graphics);
        graphics.drawString(hero.toString(), 20, 540);


        skeleton1.draw(graphics);
        graphics.drawString(skeleton1.toString(), 20, 570);

        skeleton2.draw(graphics);
        graphics.drawString(skeleton2.toString(), 20, 600);


        boss.draw(graphics);
        graphics.drawString(boss.toString(), 20, 630);

    }



    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                hero.setImage(upImage);
                hero.move(0, -1, board);
                break;
            case KeyEvent.VK_DOWN:
                hero.setImage(downImage);
                hero.move(0, 1, board);
                break;
            case KeyEvent.VK_LEFT:
                hero.setImage(leftImage);
                hero.move(-1, 0, board);
                break;
            case KeyEvent.VK_RIGHT:
                hero.setImage(rightImage);
                hero.move(1, 0, board);
                break;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
