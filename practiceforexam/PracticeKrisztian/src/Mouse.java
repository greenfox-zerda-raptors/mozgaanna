/**
 * Created by mozgaanna on 01/12/16.
 */
public class Mouse extends AbstractAnimal{


    public Mouse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 2;
    }
}
