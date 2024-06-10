package dao;

import models.Coffee;
import models.enums.*;
import services.CoffeeService;
import services.DriverService;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoffeSupplier {
    private final List<Coffee> coffeeList = new ArrayList<>();

    public CoffeSupplier() {
        init();
    }
    private void init(){
        coffeeList.add(new Coffee("Lavazza", 5,75, ECoffeType.COFFE_BEANS,EPackageType.BIG_BAG));
        coffeeList.add(new Coffee("Lavazza", 0.5,20, ECoffeType.GROUND_COFEE, EPackageType.JAR));
        coffeeList.add(new Coffee("Nescafe Gold", 0.5,10, ECoffeType.INSTANT_COFEE, EPackageType.JAR));
        coffeeList.add(new Coffee("Nescafe Classic", 1,17, ECoffeType.INSTANT_COFEE, EPackageType.MEDIUM_BAG));
        coffeeList.add(new Coffee("Nescafe Classic", 0.1,2, ECoffeType.INSTANT_COFEE,EPackageType.SMALL_BAG));
        coffeeList.add(new Coffee("Nescafe Gold", 0.1,2.2, ECoffeType.INSTANT_COFEE, EPackageType.SMALL_BAG));
    }

    public void handleOrder(DriverService driverService){
        Random random = new Random();
        while(true){
            Coffee coffee = coffeeList.get(random.nextInt(coffeeList.size()));
            if(driverService.isDriverHasMoney(CoffeeService.getTotalPrice(coffee))
                    && driverService.hasEnoughSpaceInTruck(CoffeeService.getTotalWeight(coffee))){
                driverService.putCoffeeInTruck(coffee);
            }else{
                break;
            }
        }
    }

    public List<Coffee> getCoffeList(){
        return coffeeList;
    }

}
