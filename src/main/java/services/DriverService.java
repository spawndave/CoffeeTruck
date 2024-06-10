package services;

import models.Coffee;
import models.TruckDriver;

public class DriverService {
    private final TruckDriver driver;

    public DriverService(double money, double maxWeight) {
        this.driver = new TruckDriver(money, maxWeight);
    }

    public boolean hasEnoughSpaceInTruck(double required) {
        return driver.getTruck().getAvailableWeight() >= required;
    }

    public boolean isDriverHasMoney(double required) {
        return driver.getMoney() >= required;
    }

    public void putCoffeeInTruck(Coffee item) {
        driver.setMoney(driver.getMoney() - CoffeeService.getTotalPrice(item));
        driver.getTruck().addItem(item);
    }

    public void loadCoffeeTruck() {
        CoffeeService.getSupplier().handleOrder(this);
    }
    public TruckDriver getDriver(){
        return driver;
    }
}
