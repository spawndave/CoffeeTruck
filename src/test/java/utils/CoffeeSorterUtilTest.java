package utils;

import models.Coffee;
import models.enums.ECoffeType;
import models.enums.EPackageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.ArgumentMatchers.*;


public class CoffeeSorterUtilTest {
    private List<Coffee> coffeeList = new ArrayList<>();

    @BeforeEach
    public void init() {
        coffeeList.add(new Coffee(anyString(), 12, 75, ECoffeType.COFFE_BEANS, EPackageType.BIG_BAG));
        coffeeList.add(new Coffee(anyString(), 10, 15, ECoffeType.INSTANT_COFEE, EPackageType.SMALL_BAG));
        coffeeList.add(new Coffee(anyString(), 22, 30, ECoffeType.GROUND_COFEE, EPackageType.MEDIUM_BAG));
    }

    @Test
    public void sortCoffeeByPrice() {
        CoffeeSorterUtil.sortCoffeeByPrice(coffeeList);
        List<Double> list = coffeeList.stream().map(Coffee::getPrice).toList();
        Assertions.assertEquals(15, list.get(0), 0.001);
        Assertions.assertEquals(30, list.get(1), 0.001);
        Assertions.assertEquals(75, list.get(2), 0.001);

    }
}
