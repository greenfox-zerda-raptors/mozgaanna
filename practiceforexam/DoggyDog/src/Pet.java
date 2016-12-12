/**
 * Created by mozgaanna on 03/12/16.
 */
public abstract class Pet {


    private String name;
    private String breed;
    protected String color;

    protected int sleep;
    protected int defaultFoodAmount = 400;

    protected int eatenFood;
    protected int leftFood;

    protected boolean pooNeed = false;

    public Pet(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        leftFood = defaultFoodAmount;

    }


    public boolean isPooNeed() {
        return pooNeed;
    }

    public void setPooNeed(boolean pooNeed) {
        this.pooNeed = pooNeed;
    }



//Name setter getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//Breed setter getter
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

//Sleep setter getter
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
    public int getSleep() {
        return sleep;
    }

//Eaten food setter getter
    public void setEatenFood(int eatenFood) {
        this.eatenFood = eatenFood;
    }
    public int getEatenFood() {
        return defaultFoodAmount;
    }

//Color setter getter
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", sleep=" + sleep +
                ", defaultFoodAmount=" + defaultFoodAmount +
                ", eatenFood=" + eatenFood +
                ", leftFood=" + leftFood +
                ", pooNeed=" + pooNeed +
                '}';
    }


    public abstract void eat();


    //nem tudom hogy ez itt jo e
    protected void eatAmount(int eatenFood){
        this.leftFood -= eatenFood;
        this.eatenFood += eatenFood;
    }

}
