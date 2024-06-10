package models;

import dao.CoffeSupplier;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TruckDriverTest {
    private TruckDriver driver;
    private CoffeSupplier supplier;

    @BeforeEach
    public void init() {
        driver = new TruckDriver(500, 200);
        supplier = new CoffeSupplier();
    }

    @AfterEach
    public void close() {
        driver = null;
        supplier = null;
    }

    @Test
    public void hasEnoughtSpaceInTruckTest() {
        //Assertions.assertTrue(driver.hasEnoughSpaceInTruck(200));
        //Assertions.assertFalse(driver.hasEnoughSpaceInTruck(201));
    }

    @Test
    public void hasMoneyTest() {
        //Assertions.assertTrue(driver.hasMoney(500));
        //Assertions.assertFalse(driver.hasMoney(501));
    }

    @Test
    public void searchCoffeeByQualityTest() {
        //supplier.handleOrder(driver);
        //Assertions.assertEquals(1, driver.searchCoffeeByQuality(1, 1).get(0).getQuality());
    }

}
