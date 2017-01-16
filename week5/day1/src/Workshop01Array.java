import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by mozgaanna on 14/11/16.
 */
public class Workshop01Array {
    public static void main(String[] args) {

        Random randomCars = new Random();

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("white", "blue", "red", "silver", "black", "green", "banana"));
        ArrayList<String> makes = new ArrayList<>(Arrays.asList("Toyota", "Mazda", "BMW", "VW", "Opel", "Suzuki", "Ford", "Mercedes"));
        ArrayList<Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));

        ArrayList<Car> listOfCars = new ArrayList<>(10);


        String currentName;
        String currentColor;
        Integer currentEngineSize;

        for (int i = 0; i < 40; i++) {
            currentName = makes.get(randomCars.nextInt(makes.size()));
            currentColor = colors.get(randomCars.nextInt(colors.size()));
            currentEngineSize = engineSizes.get(randomCars.nextInt(engineSizes.size()));

            listOfCars.add(new Car(currentName, currentColor, currentEngineSize, 10));
            if (i < 2) {
                listOfCars.get(i).drive(15);
                System.out.println(listOfCars.get(i).toString());
            }
        }

        for (Car car: listOfCars) {
            System.out.println(car.toString());


        }
    }
}
