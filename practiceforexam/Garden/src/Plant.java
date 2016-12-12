/**
 * Created by mozgaanna on 04/12/16.
 */
public abstract class Plant{

    protected String color;
    protected float absorbedWater;


    public Plant(String color){
        this.color = color;
    }

    public abstract void water(float waterPerPlant);

    public abstract boolean waterNeed();

}
