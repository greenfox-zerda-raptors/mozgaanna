/**
 * Created by mozgaanna on 03/12/16.
 */
public class GreatDane extends Dog {


    public GreatDane(String name, String color) {
        super(name, "Great Dane", color);
    }

    @Override
    public void eat(){
        eatAmount(70);
        if (eatenFood >= 140){
            pooNeed = true;

            System.out.println("Take the dane for a walk");
        }
    }

}
