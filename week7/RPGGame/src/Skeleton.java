/**
 * Created by mozgaanna on 07/12/16.
 */
public class Skeleton extends People {

    public Skeleton(int posX, int posY) {
        super("skeleton.png", posX, posY);
        this.setName("Skeleton");
        this.setSP((1 * randSP.nextInt(6)) + 1);
        this.setHP(2 * 1 * randHP.nextInt(6) + 1);
        this.setDP(1 / 2 * randDP.nextInt(6)+1);
        this.setAlive(true);

    }
}
