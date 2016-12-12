import java.util.ArrayList;

/**
 * Created by mozgaanna on 27/11/16.
 */
public class Garden {
    private ArrayList<Plant> plants = new ArrayList<>();


    public void addPlant(Plant plantAdded){
        plants.add(plantAdded);
    }

//method for watering the plants
    public void water(float waterAmount){
        int plantsNeedingWaterCount = 0;
        for (Plant plant : plants){
            if (plant.waterNeed()){
                plantsNeedingWaterCount++;
            }
        }
        float waterPerPlant = waterAmount / plantsNeedingWaterCount;
        for (Plant wateredPlant : plants){
            if (wateredPlant.waterNeed()) {
                wateredPlant.water(waterPerPlant);
            }
        }

    }

    @Override
    public String toString() {
        String gardenString = "";
        for (Plant plant : plants){
            gardenString += plant.toString() + "\n";
        }
        return gardenString;
    }
}
