/**
 * Created by mozgaanna on 29/11/16.
 */
public class Pirate {

    private int drinkNumber;
    private boolean isAlive;
    private boolean isAsleep;



    //default constructor
    public Pirate(){
      drinkNumber = 0;
      isAlive = true;
      isAsleep = false;
    }



    //need a method
    public String drinkSomeRum() {

        //Misi megoldasa
            if (isAlive){
                if (!isAsleep){
                    drinkNumber++;
                }


//                if (drinkNumber > 4) {
//                    isAsleep = true;
//                    return "He is asleep";
//                }

            } else {
                return "He is dead!";
            }
        return String.format("DrinkNumber: %d", drinkNumber);
    }



//        //Csaba megoldasa
//        if (isAsleep && !isAsleep) {
//            drinkNumber++;
//            return String.format("DrinkNumber: %d \n", drinkNumber);
//        }
//        if (isAlive) {
//            return "He is dead!";
//        }
//        if (drinkNumber > 4) {
//            isAsleep = true;
//            return "He is asleep!";
//        }




        //M.Anna megoldasa
//        if (isAsleep) {
//            if (isAlive) {                                                              //hozza kell adni egyet ha hivod
//                drinkNumber++;                                                          //kell egy if hogy ne ihasson halottan
//                return String.format("DrinkNumber: %d \n", drinkNumber);
//            }
//
//        } else {
//            return ("He is dead");
//        }
//    }



    //method
    public String howsItGoingMate(){
        if (drinkNumber <= 4) {
            return "Pour me anudder!";
        } else {
            isAsleep = true;
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }

    }


    public void die(){
        isAlive = false;
    }


    //getter az appban hasznalt sout-hoz
    public boolean getIsAlive() {
        return isAlive;
    }


}


