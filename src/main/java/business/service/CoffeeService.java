package business.service;

import business.dao.CoffeSupplierDao;
import entity.Coffee;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CoffeeService {

    private static final CoffeSupplierDao supplier = new CoffeSupplierDao();

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

    public static List<Coffee> getCoffeeList(){
        return supplier.getCoffeeList();
    }
}
