/**
 * Created by mozgaanna on 07/12/16.
 */
public class Boss extends People {

    public Boss() {
        super("boss.png", 3, 8);
        this.name = "kulcsos kocsog";
        this.setSP((1 * randSP.nextInt(6)) + 1 + 1);
        this.setHP(2 * 1 * randHP.nextInt(6) + 1 + randHP.nextInt(6) + 1);
        this.setDP(1 / 2 * randDP.nextInt(6)+1 + (randDP.nextInt(6)+1) / 2);
        this.setAlive(true);

    }
}
