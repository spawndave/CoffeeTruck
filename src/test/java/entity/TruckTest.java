package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TruckTest {
    private Truck truck;
    @Mock
    private Coffee coffee;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        truck = new Truck(200);
    }

    @Test
    public void addItemTest() {
        //when(coffee.getTotalWeight()).thenReturn(5d);
        truck.addItem(coffee);
        Assertions.assertEquals(195, truck.getAvailableWeight(), 0.001);
    }

    @Test
    public void getAvailableCoffeeListTest() {
        truck.addItem(coffee);
       // Assertions.assertEquals(1, truck.getAvailableCoffeeList().size());
    }
}
