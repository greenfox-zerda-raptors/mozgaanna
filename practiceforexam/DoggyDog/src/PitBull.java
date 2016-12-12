/**
 * Created by mozgaanna on 03/12/16.
 */
public class PitBull extends Dog {


    public PitBull(String name, String color) {
        super(name, "Pit Bull", color);
    }


    @Override
    public void setSleep(int sleep) {
        super.setSleep(sleep);
        this.sleep = 14;
    }

    @Override
    public void eat(){
        eatAmount(40);
        if (eatenFood >= 80){
            pooNeed = true;

            System.out.println("Take the pitbulls for a walk");
        }
    }
}
