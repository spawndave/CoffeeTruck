package utils;

import models.Coffee;

import java.util.Comparator;
import java.util.List;

public class CoffeeSorterUtil {
    public static void sortCoffeeByPrice(List<Coffee> coffeeList){
        coffeeList.sort(Comparator.comparing(Coffee::getTotalPrice));
    }

    public static void sortCoffeeByWeight(List<Coffee> coffeeList){
        coffeeList.sort(Comparator.comparing(Coffee::getTotalWeight));
    }

}
