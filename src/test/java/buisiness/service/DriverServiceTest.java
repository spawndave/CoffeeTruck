package buisiness.service;

import business.service.CoffeeService;
import business.service.DriverService;
import entity.Coffee;
import entity.enums.ECoffeType;
import entity.enums.EPackageType;
import org.junit.jupiter.api.*;

import java.util.*;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class DriverServiceTest {
    private final DriverService driverService = new DriverService(100, 100);
    private final List<Coffee> coffeeList = CoffeeService.getCoffeeList();

    @TestFactory
    Iterator<DynamicTest> loadCoffeeTruckTest() {
        Coffee coffee = new Coffee(anyInt(), any(), 90, 90, ECoffeType.COFFE_BEANS, EPackageType.JAR);
        double coffeePrice = CoffeeService.getTotalPrice(coffee);
        double coffeeWeight = CoffeeService.getTotalWeight(coffee);
        return asList(
                dynamicTest("coffee list is not empty",
                        () -> assertFalse(coffeeList.isEmpty())),
                dynamicTest("check money (driver has money)",
                        () -> assertTrue(driverService.isDriverHasMoney(coffeePrice))),
                dynamicTest("check weight (truck has free space)",
                        () -> assertTrue(driverService.hasEnoughSpaceInTruck(coffeeWeight))),
                dynamicTest("test put coffee in truck",
                        () -> {
                            driverService.putCoffeeInTruck(coffee);
                            assertEquals(1, driverService.getCoffeeListFromTruck().size());
                        }),
                dynamicTest("check money (no money)",
                        () -> assertFalse(driverService.isDriverHasMoney(coffeePrice))),
                dynamicTest("check weight (no free space)",
                        () -> assertFalse(driverService.hasEnoughSpaceInTruck(coffeeWeight)))
        ).iterator();
    }


}
