/**
 * Created by mozgaanna on 14/11/16.
 */


// Car.java
public class Car {
    private String name;
    private String color;
    private int sizeEngine;
    private int kmOdometer;

    void drive(int kilometer){
        if (kilometer < 20) {
            System.out.println("brrm, " + name + " just drove around town " + kilometer + " clicks.");
        } else if (kilometer > 20 && kilometer < 50) {
                System.out.println("brrm, screech, brrm, screech; " + name + " commuted " + kilometer + " clicks.");
        } else {
            System.out.println("whee, " + name + kilometer + " clicks.");
        }
        this.kmOdometer += kilometer;
    }

    public String toString(){
        return String.format("This %s is %s, has a %d cc Engine and clocked %d km's!\n",
                name, color, sizeEngine, kmOdometer);

    }


    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }


    public void setSizeEngine (int sizeEngine){
        this.sizeEngine = sizeEngine;
    }
    public int getSizeEngine (){
        return sizeEngine;
    }

    public void setKmOdometer (int kmOdometer){
        this.kmOdometer = kmOdometer;
    }
    public int getKmOdometer (){
        return kmOdometer;
    }





    public Car() {
        this.name = "Mazda";
        this.color = "red";
        this.sizeEngine = 1600;
        this.kmOdometer = 12312;

    }

    public Car (String name, String color, int sizeEngine, int kmOdometer){
        this.name = name;
        this.color = color;
        this.sizeEngine = sizeEngine;
        this.kmOdometer = kmOdometer;

        }

    public Car (String name, String color) {
        this.name = name;
        this.color = color;
        this.sizeEngine = 1600;
        this.kmOdometer = 10;

//        this(name, color, 1600, 10);
    }n

    public Car (int sizeEngine, int kmOdometer){
        this.name = "Mazda";
        this.color = "red";
        this.sizeEngine = sizeEngine;
        this.kmOdometer = kmOdometer;

    }

        //Add somethings here to create a car and some fields


}
