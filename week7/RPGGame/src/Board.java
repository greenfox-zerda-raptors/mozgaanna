import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


/**
 * Created by mozgaanna on 05/12/16.
 */
public class Board extends JComponent implements KeyListener {
    ArrayList<GameObject> gameObjects;

    Hero hero = new Hero();
    Skeleton skeleton1 = new Skeleton();
    Boss boss = new Boss();


    public Board() {
        int[][] board = new int[][]{
                {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
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


        boss.draw(graphics);
        graphics.drawString(boss.toString(), 20, 600);

    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                hero.move(0, -1);
                break;
            case KeyEvent.VK_DOWN:
                hero.move(0, 1);
                break;
            case KeyEvent.VK_LEFT:
                hero.move(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
                hero.move(1, 0);
                break;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
