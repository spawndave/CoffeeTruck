package business.service;

import entity.Coffee;
import entity.TruckDriver;

import java.util.List;
import java.util.Random;

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
        Random random = new Random();
        List<Coffee> coffeeList = CoffeeService.getCoffeeList();
        while(true){
            Coffee coffee = coffeeList.get(random.nextInt(coffeeList.size()));
            if(this.isDriverHasMoney(CoffeeService.getTotalPrice(coffee))
                    && this.hasEnoughSpaceInTruck(CoffeeService.getTotalWeight(coffee))){
                this.putCoffeeInTruck(coffee);
            }else{
                break;
            }
        }
    }
    public List<Coffee> getCoffeeListFromTruck() {
        return driver.getTruck().getCoffeeListFromTruck();
    }
}
