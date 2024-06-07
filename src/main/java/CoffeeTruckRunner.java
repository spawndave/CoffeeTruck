

import models.CoffeSupplier;
import models.Coffee;
import models.TruckDriver;
import java.util.List;
import java.util.Scanner;


public class CoffeeTruckRunner {
    public static final int DRIVER_MONEY = 500;
    public static final int DRIVER_TRUCK_AVAILABLE_SPACE = 50;
    public static void main(String[] args) {
        CoffeSupplier supplier = new CoffeSupplier();
        TruckDriver driver =new TruckDriver(DRIVER_MONEY, DRIVER_TRUCK_AVAILABLE_SPACE);
        Scanner scan = new Scanner(System.in);
        System.out.println("Список доступного кофе в отсортированном виде по цене:");
        supplier.sortCoffeeByPrice().getCoffeList().forEach(System.out::println);
        System.out.println("===========================================================");
        System.out.println("Список доступного кофе в отсортированном виде по весу:");
        supplier.sortCoffeeByWeight().getCoffeList().forEach(System.out::println);
        System.out.println("===============Загрузка кофе===========================");
        driver.loadCoffeeTruck();
        System.out.println("Кофе загруженное в грузовик:");
        driver.getCoffeeList().forEach(System.out::println);
        System.out.println("Поиск кофе в фургоне, соответствующий заданному диапазону параметров качества");
        System.out.println("Параметры качества:");
        System.out.println("1 - высокое качество (зерна)");
        System.out.println("2 - среднее качество (молотый кофе)");
        System.out.println("3 - низкое качество (растворимый кофе)");
        System.out.println("Введите мин значение качества");
        int minQuality = scan.nextInt();
        System.out.println("Введите макс значение качества");
        int maxQuality = scan.nextInt();
        List<Coffee> coffeeList = driver.searchCoffeeByQuality(minQuality, maxQuality);
        coffeeList.forEach(System.out::println);
    }
}
