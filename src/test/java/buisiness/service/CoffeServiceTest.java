package buisiness.service;

import buisiness.dao.CoffeeSupplierDaoTest;
import business.dao.CoffeSupplierDao;
import business.service.CoffeeService;
import entity.Coffee;
import entity.enums.ECoffeType;
import entity.enums.EPackageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeServiceTest {

    private CoffeSupplierDao supplierDao = new CoffeSupplierDao();;
    private List<Coffee> coffeeList;

    @BeforeEach
    void init() {
        coffeeList = supplierDao.getCoffeeList();
    }

    @Test
    void searchCoffeeByQualityTest() {
        coffeeList = CoffeeService.searchCoffeeByQuality(coffeeList, 1, 1);
        coffeeList.forEach((coffee) -> assertEquals(1, coffee.getQuality()));
    }

    @Test
    void getTotalPriceAndWeightTest() {
        Coffee coffee = new Coffee(1,"Lavazza", 0.5, 20, ECoffeType.GROUND_COFEE, EPackageType.JAR);
        assertAll(
                () -> assertEquals(30, CoffeeService.getTotalPrice(coffee),0.01),
                () -> assertEquals(5.5  , CoffeeService.getTotalWeight(coffee), 0.01)
        );
    }
    @Test
    void sortCoffeeByPriceTest(){
        CoffeeService.sortCoffeeByPrice(coffeeList);
        coffeeList.stream().reduce((prevCoffee, coffee) -> {
            assertTrue(CoffeeService.getTotalPrice(coffee) >= CoffeeService.getTotalPrice(prevCoffee));
            return coffee;
        });
    }

    @Test
    void sortCoffeeByWeightTest(){
        CoffeeService.sortCoffeeByWeight(coffeeList);
        coffeeList.stream().reduce((prevCoffee, coffee) -> {
            assertTrue(CoffeeService.getTotalWeight(coffee) >= CoffeeService.getTotalWeight(prevCoffee));
            return coffee;
        });
    }

}
