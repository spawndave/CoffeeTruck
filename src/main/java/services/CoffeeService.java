package services;

import dao.CoffeSupplier;
import models.Coffee;
import java.util.Comparator;
import java.util.List;

public class CoffeeService {

    private static final CoffeSupplier  supplier = new CoffeSupplier();

    public static void sortCoffeeByPrice(List<Coffee> coffeeList){
        coffeeList.sort(Comparator.comparing(CoffeeService::getTotalPrice));
    }

    public static void sortCoffeeByWeight(List<Coffee> coffeeList){
        coffeeList.sort(Comparator.comparing(CoffeeService::getTotalWeight));
    }

    public static List<Coffee> searchCoffeeByQuality(List<Coffee> coffeeList, int min, int max){
        return coffeeList.stream()
                .filter(coffee -> coffee.getQuality() >= min && coffee.getQuality() <= max)
                .toList();
    }

    public static double getTotalPrice(Coffee coffee){
        return coffee.getPrice() + coffee.getPackageType().getPrice();
    }

    public static double getTotalWeight(Coffee coffee){
        return coffee.getWeight() + coffee.getPackageType().getWeight();
    }

    public static CoffeSupplier getSupplier(){
        return supplier;
    }
}
