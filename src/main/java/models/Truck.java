package models;

import java.util.ArrayList;
import java.util.List;

public final class Truck  {

    private double availableWeight;
    private List<Coffee> items = new ArrayList<>();

    public Truck(double availableWeight) {
        this.availableWeight = availableWeight;
    }

    public void addItem(Coffee item) {
        availableWeight -= item.getTotalWeight();
        items.add(item);
    }
    public double getAvailableWeight() {
        return availableWeight;
    }
    public List<Coffee> getAvailableCoffeeList(){
        return items;
    }
    public void setAvailableWeight(double weight){
        availableWeight = weight;
    }
}

