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

// Exercise 3
//        System.out.printf("Just got a new %s, it's %s and has a %d cc Engine and clocked %d km's!\n",
//                 myCar.getName(), myCar.getColor(), myCar.getSizeEngine(), myCar.getKmOdometer()
//             );
//        System.out.printf("Just got a new %s, it's %s and has a %d cc Engine and clocked %d km's!\n",
//                myCar1.getName(), myCar1.getColor(), myCar1.getSizeEngine(), myCar1.getKmOdometer()
//        );
//        System.out.printf("Just got a new %s, it's %s and has a %d cc Engine and clocked %d km's!\n",
//                myCar2.getName(), myCar2.getColor(), myCar2.getSizeEngine(), myCar2.getKmOdometer()
//        );


//Exercise 4
//        myCar.drive(15);
//        System.out.printf("This %s is %s, has a %d cc Engine and clocked %d km's!\n",
//                 myCar.getName(), myCar.getColor(), myCar.getSizeEngine(), myCar.getKmOdometer()
//        );
//
//        myCar1.drive(60);
//        System.out.printf("This %s is %s, has a %d cc Engine and clocked %d km's!\n",
//                myCar1.getName(), myCar1.getColor(), myCar1.getSizeEngine(), myCar1.getKmOdometer()
//        );
//
//        myCar2.drive(49);
//        System.out.printf("This %s is %s, has a %d cc Engine and clocked %d km's!\n",
//                myCar2.getName(), myCar2.getColor(), myCar2.getSizeEngine(), myCar2.getKmOdometer()
//        );


//Exercise 5
//        myCar.drive(15);
//        System.out.println(myCar.toString());
//        myCar1.drive(60);
//        System.out.println(myCar1.toString());
//        myCar2.drive(49);
//        System.out.println(myCar2.toString());


//Exercise 6

        Car myCar4 = new Car("Opel", "white", 1400, 25);
        System.out.println(myCar4.toString());

        Car myCar5 = new Car("VW", "grey");
        System.out.println(myCar5.toString());

        Car myCar6 = new Car (1100, 15);
        System.out.println(myCar6.toString());






    }
}
