package models;

import services.CoffeeService;

import java.util.ArrayList;
import java.util.List;

public final class Truck  {

    private final double availableWeight;
    private final List<Coffee> products = new ArrayList<>();

    public Truck(double availableWeight) {
        this.availableWeight = availableWeight;
    }

    public void addItem(Coffee item) {
       products.add(item);
    }
    public double getAvailableWeight() {
        return availableWeight;
    }
    public List<Coffee> getProducts(){
        return products;
    }

}

