import java.util.Random;

/**
 * Created by mozgaanna on 07/12/16.
 */
public class People extends GameObject {

    public People(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.SV = this.SP + (randSV.nextInt(6) + 1) * 2;
    }

    protected String name;
    protected int HP;
    protected int DP;
    protected int SP;
    protected int SV;
    protected boolean isAlive = true;

    Random randHP = new Random();
    Random randDP = new Random();
    Random randSP = new Random();
    Random randSV = new Random();


    public void damage(People attacker) {
        this.HP = HP - attacker.SV;
        if (this.HP <= 0) {
            this.setAlive(false);
        }
    }
    public void attack(People attacked) {
        attacked.damage(this);
    }


    //Name setter getter
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    //HP setter getter
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    //DP setter getter
    public int getDP() {
        return DP;
    }

    public void setDP(int DP) {
        this.DP = DP;
    }

    //SP setter getter
    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    //SV setter getter
    public int getSV() {
        return SV;
    }

    public void setSV(int SV) {
        this.SV = SV;
    }

    //isAlive setter getter
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    @Override
    public String toString() {
        if (isAlive) {
            return this.getClass().getSimpleName() + ": " + name +
                    ", HP=" + HP + ", DP=" + DP + ", SP=" + SP;
        } else {
            return this.getClass().getSimpleName() + ": DEAD";
        }
    }




}
