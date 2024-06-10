package models;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CoffeeSupplierTest {
    private TruckDriver driver = new TruckDriver(300, 200);;
    @Mock
    private Coffee coffee;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    @DisplayName("😱")
    @Test
    public void handleOrderTest() {
       /* driver.putCoffeeInTruck(coffee);
        driver.putCoffeeInTruck(coffee);
        Assertions.assertEquals(2, driver.getCoffeeList().size());*/
    }
}
