package models;

import models.enums.*;
import utils.CoffeeSorterUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoffeSupplier {
    private List<Coffee> coffeeList = new ArrayList<>();

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

    public void handleOrder(TruckDriver driver){
        Random random = new Random();
        while(true){
            Coffee item = coffeeList.get(random.nextInt(coffeeList.size()));
            if(driver.hasMoney(item.getTotalPrice())
                    && driver.hasEnoughSpaceInTruck(item.getTotalWeight())){
                driver.putCoffeeInTruck(item);
            }else{
                break;
            }
        }
    }

    public CoffeSupplier sortCoffeeByPrice(){
        CoffeeSorterUtil.sortCoffeeByPrice(coffeeList);
        return this;
    }

    public CoffeSupplier sortCoffeeByWeight(){
        CoffeeSorterUtil.sortCoffeeByWeight(coffeeList);
        return this;
    }

    public List<Coffee> getCoffeList(){
        return coffeeList;
    }

}
