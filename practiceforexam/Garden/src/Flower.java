/**
 * Created by mozgaanna on 04/12/16.
 */
public class Flower extends Plant {

    public Flower(String color) {
        super(color);


    }

    @Override
    public void water(float waterPerPlant) {
        absorbedWater += waterPerPlant * 0.75;
    }

    @Override
    public boolean waterNeed() {
        if (absorbedWater < 5){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (waterNeed()){
            return String.format("The %s flower needs water", color );
        } else {
            return String.format("The %s flower doesn't need water", color );
        }
    }
}
