/**
 * Created by mozgaanna on 15/11/16.
 */
public class Dog extends Animal {
    boolean hasTail;

    public Dog(){
        super(15, true);
        hasTail = true;
    }

    @Override
    public void speak(){
        System.out.println("barks");
    }

    public void beg(){
        System.out.println("begs");
    }

}
