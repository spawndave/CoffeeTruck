package models;

import models.enums.ECoffeType;
import models.enums.EPackageType;
import org.junit.jupiter.api.*;


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
        Assertions.assertEquals(78, coffee.getTotalPrice());
    }

    @Test
    public void getTotalWeight() {
        Assertions.assertEquals(6, coffee.getTotalWeight());
    }

    @Test
    public void getQualityTest() {
        Assertions.assertEquals(1, coffee.getQuality());
    }
}
