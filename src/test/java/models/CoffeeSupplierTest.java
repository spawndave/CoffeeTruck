package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CoffeeSupplierTest {
    private TruckDriver driver;
    @Mock
    private Coffee coffee;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        driver = new TruckDriver(300, 200);
    }

    @AfterEach
    public void close() {
        driver = null;
    }

    @Test
    public void handleOrderTest() {
        driver.putCoffeeInTruck(coffee);
        driver.putCoffeeInTruck(coffee);
        Assertions.assertEquals(2, driver.getCoffeeList().size());
    }
}
