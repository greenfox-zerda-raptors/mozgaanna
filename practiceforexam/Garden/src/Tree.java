/**
 * Created by mozgaanna on 04/12/16.
 */
public class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    @Override
    public void water(float waterPerPlant) {
        absorbedWater += waterPerPlant * 0.4;
    }

    @Override
    public boolean waterNeed() {
        if (absorbedWater < 10){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (waterNeed()){
            return String.format("The %s tree needs water", color );
        } else {
            return String.format("The %s tree doesn't need water", color );
        }
    }

}
