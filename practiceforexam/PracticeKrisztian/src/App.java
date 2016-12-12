import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mozgaanna on 01/12/16.
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse("Paci"));
        animals.add(new Horse("Saci"));
        animals.add(new Horse("Paca"));
        animals.add(new Mouse("Cic"));
        animals.add(new Mouse("Rudy"));
        animals.add(new Mouse("Siccc"));
        animals.add(new Ant());

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        //nem magat az objektubom kapod meg, hanem egy valtozod ami az object helyere mutat

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator:" + animal);
        }

        //elso harom allat
        iterator = animals.iterator();
        for (int i = 0; i < 3; i++) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }

        //iterator eltarolja hol tartottal!!!
        //maradek allat
        System.out.println("We doing something else.");
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator:" + animal);
        }
    }
}
