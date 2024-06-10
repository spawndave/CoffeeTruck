package entity;

import entity.enums.ECoffeType;
import entity.enums.EPackageType;
import org.junit.jupiter.api.*;
import business.service.CoffeeService;


public class CoffeeTest {
    private Coffee coffee;

    @BeforeEach
    public void init() {
        coffee = new Coffee("Lavazza", 5, 75, ECoffeType.COFFE_BEANS, EPackageType.BIG_BAG);
    }

    @AfterEach
    public void close() {
        coffee = null;
    }

    @Test
    public void getTotalPriceTest() {
        Assertions.assertEquals(78, CoffeeService.getTotalPrice(coffee));
    }

    @Test
    public void getTotalWeight() {
        Assertions.assertEquals(6, CoffeeService.getTotalWeight(coffee));
    }

    @Test
    public void getQualityTest() {
        Assertions.assertEquals(1, coffee.getQuality());
    }
}
