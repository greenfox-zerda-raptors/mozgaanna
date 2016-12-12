/**
 * Created by mozgaanna on 01/12/16.
 */
public class Horse extends AbstractAnimal{


    public Horse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 20;
    }

}
