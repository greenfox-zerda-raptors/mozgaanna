/**
 * Created by mozgaanna on 07/12/16.
 */
public class Character extends GameObject {

    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    protected String name;
    protected int HP ;
    protected int DP;
    protected int SP;

    //I dont know whether ill use it
    //protected boolean isAlive = true;


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


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                 name  +
                ", HP=" + HP +
                ", DP=" + DP +
                ", SP=" + SP
        ;
    }
}
