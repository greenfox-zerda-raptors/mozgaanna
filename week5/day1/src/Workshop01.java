/**
 * Created by mozgaanna on 14/11/16.
 */
public class Workshop01 {
    public static void main(String[] args) {

        Car myCar = new Car ();
        myCar.setName("Mazda");
        myCar.setColor("red");
        myCar.setSizeEngine(1600);
        myCar.setKmOdometer(12312);

        Car myCar1 = new Car ();
        myCar1.setName("Ford");
        myCar1.setColor("silver");
        myCar1.setSizeEngine(2500);
        myCar1.setKmOdometer(152312);

        Car myCar2 = new Car ();
        myCar2.setName("Beamer");
        myCar2.setColor("green");
        myCar2.setSizeEngine(2800);
        myCar2.setKmOdometer(42521);


        System.out.printf("Just got a new %s, it's %s and has a %d cc Engine and clocked %d km's!\n",
                 myCar.getName(), myCar.getColor(), myCar.getSizeEngine(), myCar.getKmOdometer()
             );
        System.out.printf("Just got a new %s, it's %s and has a %d cc Engine and clocked %d km's!\n",
                myCar1.getName(), myCar1.getColor(), myCar1.getSizeEngine(), myCar1.getKmOdometer()
        );
        System.out.printf("Just got a new %s, it's %s and has a %d cc Engine and clocked %d km's!\n",
                myCar2.getName(), myCar2.getColor(), myCar2.getSizeEngine(), myCar2.getKmOdometer()
        );
    }
}
