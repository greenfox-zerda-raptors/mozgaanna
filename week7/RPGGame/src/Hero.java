/**
 * Created by mozgaanna on 07/12/16.
 */
public class Hero extends Character {

    public Hero() {
        super("hero-down.png", 0, 0);
        this.name = "Anna";
        this.setDP(2);
        this.setHP(20);
        this.setSP(5);
    }

    public void move(int moveX, int moveY, int[][] board){
        int nextX = posX + moveX;
        int nextY = posY + moveY;
        if (nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board.length && board[nextX][nextY] != 0) {

            posX += moveX;
            posY += moveY;
        }
    }



}
