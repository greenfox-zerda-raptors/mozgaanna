import java.util.ArrayList;

/**
 * Created by mozgaanna on 03/12/16.
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Pet> dogs = new ArrayList<>();
        dogs.add(new Pincher("Pincsi", "brown"));
        dogs.add(new PitBull("Liberty", "black"));
        dogs.add(new PitBull("Desmond", "black-brown"));
        dogs.add(new GreatDane("Fraid", "beige"));

        for (Pet doggys : dogs){
            System.out.println(doggys.toString());
        }


        for (int i = 0; i <= 3; i++){
            System.out.println();
            if (i == 0){
                System.out.println("The dogs are hungry. Feed them!");
            } else if (i <= 3){
                System.out.println("They're still hungry, feed them again!");
            }

            for (Pet doggys : dogs){
                doggys.eat();
                System.out.println(doggys.toString());

            }


        }
        System.out.println();
        System.out.println("They are not hungry, thank you for feeding them!");
    }
}
