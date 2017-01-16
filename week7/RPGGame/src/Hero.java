/**
 * Created by mozgaanna on 07/12/16.
 */
public class Hero extends People {

    public Hero() {
        super("hero-down.png", 0, 0);
        this.name = "Anna";
        this.setHP(20 + 3 * randHP.nextInt(6)+1);
        this.setDP(2 * randDP.nextInt(6)+1);
        this.setSP(5 + randSP.nextInt(6)+1);



    }


    public void incrementAppleHP(){
        this.setHP(getHP() + 50000000);
    }



    public void move(int moveX, int moveY, int[][] board){
        int nextX = posX + moveX;
        int nextY = posY + moveY;
        if (nextX >= 0 && nextX < board.length
                && nextY >= 0 && nextY < board.length
                && board[nextX][nextY] != 0) {
            posX += moveX;
            posY += moveY;
        }
    }



}

