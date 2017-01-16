import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by mozgaanna on 05/12/16.
 */
public class Board extends JComponent implements KeyListener {
    ArrayList<GameObject> gameObjects;
    ArrayList<People> attackers;

    Hero hero = new Hero();
    Skeleton skeletonOne = new Skeleton(7, 2);
    Skeleton skeletonTwo = new Skeleton(2, 4);
    Boss boss = new Boss();
    Apple apple = new Apple(10, 0);
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





        attackers = new ArrayList<>(Arrays.asList(boss, skeletonOne, skeletonTwo));
    }



    @Override
    public void paint(Graphics graphics) {
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }

        if (boss.isAlive){
            boss.draw(graphics);
        } graphics.drawString(boss.toString(), 20, 570);

        hero.draw(graphics);
        graphics.drawString(hero.toString(), 20, 540);






        apple.draw(graphics);

        if (hero.posX == apple.posX && hero.posY == apple.posY){
            hero.incrementAppleHP();
        }


        if (skeletonOne.isAlive) {
            skeletonOne.draw(graphics);
        } graphics.drawString(skeletonOne.toString(), 20, 630);

        if (skeletonTwo.isAlive){
            skeletonTwo.draw(graphics);
        } graphics.drawString(skeletonTwo.toString(), 20, 600);

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
            case KeyEvent.VK_SPACE:
                for (People monster : attackers) {
                    if (hero.posX == monster.posX
                            && hero.posY == monster.posY
                            && monster.isAlive) {
                        hero.attack(monster);
                        monster.attack(hero);
                    }
                }
        }
        repaint();
    }






    @Override
    public void keyReleased(KeyEvent e) {
    }

}
