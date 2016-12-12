/**
 * Created by mozgaanna on 03/12/16.
 */
public class Pincher extends Dog {


    public Pincher(String name, String color) {
        super(name, "Pincher", color);
    }

    @Override
    public void eat(){
        eatAmount(15);
        if (eatenFood >= 45){
            pooNeed = true;

            System.out.println("Take the pincher for a walk");
        }
    }
}
