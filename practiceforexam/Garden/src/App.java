
/**
 * Created by mozgaanna on 27/11/16.
 */
public class App {


    public static void main(String[] args) {
        Garden myGarden = new Garden();
        myGarden.addPlant(new Flower("Yellow"));
        myGarden.addPlant(new Flower("Blue"));
        myGarden.addPlant(new Tree("Orange"));
        myGarden.addPlant(new Tree("Purple"));

        System.out.println(myGarden);
        myGarden.water(40);
        System.out.println(myGarden);
        myGarden.water(70);
        System.out.println(myGarden);

    }

}
