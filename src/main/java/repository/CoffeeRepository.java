package repository;

import entity.Coffee;
import entity.enums.ECoffeType;
import entity.enums.EPackageType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeeRepository {

    private  List<Coffee> coffeeList = new ArrayList<>();

     {
        coffeeList.add(new Coffee(1,"Lavazza", 5, 75, ECoffeType.COFFE_BEANS, EPackageType.BIG_BAG));
        coffeeList.add(new Coffee(1,"Lavazza", 0.5, 20, ECoffeType.GROUND_COFEE, EPackageType.JAR));
        coffeeList.add(new Coffee(3,"Nescafe Gold", 0.5, 10, ECoffeType.INSTANT_COFEE, EPackageType.JAR));
        coffeeList.add(new Coffee(4,"Nescafe Classic", 1, 17, ECoffeType.INSTANT_COFEE, EPackageType.MEDIUM_BAG));
        coffeeList.add(new Coffee(5, "Nescafe Classic", 0.1, 2, ECoffeType.INSTANT_COFEE, EPackageType.SMALL_BAG));
        coffeeList.add(new Coffee(6,"Nescafe Gold", 0.1, 2.2, ECoffeType.INSTANT_COFEE, EPackageType.SMALL_BAG));
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void addCoffee(Coffee coffee) {
         coffeeList.add(coffee);
    }

    public Coffee getCoffeeById(int id) {
         return coffeeList.get(id);
    }

}
