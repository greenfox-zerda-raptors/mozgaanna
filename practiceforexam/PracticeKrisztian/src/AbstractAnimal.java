/**
 * Created by mozgaanna on 01/12/16.
 */
public abstract class AbstractAnimal implements Animal {


    protected int movedDistance = 0;
    protected int feedCounter = 0;
    private String name;
    protected int childrenNumber = 0;

    protected AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(int childrenNumber) {
        this.childrenNumber = childrenNumber;
    }


    @Override
    public void move(int distance) {
        this.movedDistance += distance;
    }

    @Override
    public void feed() {
        this.feedCounter += defaultFoodAmount();
    }

    abstract int defaultFoodAmount();


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "movedDistance=" + movedDistance +
                ", feedCounter=" + feedCounter +
                ", name='" + name + '\'' +
                ", childrenNumber=" + childrenNumber +
                '}';
    }

    public int getFeedCounter() {
        return feedCounter;
    }
}
