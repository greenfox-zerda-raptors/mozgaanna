/**
 * Created by mozgaanna on 14/11/16.
 */


// Car.java
public class Car {
    private String name;
    private String color;
    private int sizeEngine;
    private int kmOdometer;

    void drive(){
        
    }


    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setColor (String color){
        this.color = color;
    }
    public String getColor (){
        return color;
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



        //Add somethings here to create a car and some fields
    }

}
