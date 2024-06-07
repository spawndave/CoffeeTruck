package models;

import java.util.List;

public class TruckDriver {
    private double money;
    private final Truck truck;
    private final CoffeSupplier supplier = new CoffeSupplier();

    public TruckDriver(double money, double maxWeight) {
        this.truck = new Truck(maxWeight);
        this.money = money;
    }

    void putCoffeeInTruck(Coffee item) {
        money -= item.getTotalPrice();
        this.truck.addItem(item);
    }

    public void loadCoffeeTruck() {
        supplier.handleOrder(this);
    }

    public boolean hasEnoughSpaceInTruck(double required) {
        return truck.getAvailableWeight() >= required;
    }

    public boolean hasMoney(double required) {
        return money >= required;
    }
    public List<Coffee> getCoffeeList(){
        return truck.getAvailableCoffeeList();
    }

    public List<Coffee> searchCoffeeByQuality(int minQuality, int maxQuality){
        List<Coffee> result = truck.getAvailableCoffeeList().stream()
                .filter(coffee -> coffee.getQuality() >= minQuality && coffee.getQuality() <= maxQuality)
                .toList();
        return result;
    }

}
