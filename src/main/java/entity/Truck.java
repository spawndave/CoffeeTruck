package entity;

import java.util.ArrayList;
import java.util.List;

public final class Truck  {

    private double availableWeight;
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
    public void setAvailableWeight(double weight){
        this.availableWeight = weight;
    }
    public List<Coffee> getCoffeeListFromTruck(){
        return products;
    }

}

