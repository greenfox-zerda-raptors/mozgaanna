/**
 * Created by mozgaanna on 29/11/16.
 */
public class App {
    public static void main(String[] args) {
        Pirate pirate = new Pirate();

        System.out.println(pirate.drinkSomeRum());
        System.out.println(pirate.howsItGoingMate());


        System.out.println(pirate.drinkSomeRum());
        System.out.println(pirate.drinkSomeRum());
        System.out.println(pirate.howsItGoingMate());
        System.out.println(pirate.drinkSomeRum());
        System.out.println(pirate.drinkSomeRum());
        System.out.println(pirate.drinkSomeRum());




        System.out.println(pirate.howsItGoingMate());

        pirate.die();
        pirate.drinkSomeRum();

        System.out.println("Is alive: " + pirate.getIsAlive());
    }
}
