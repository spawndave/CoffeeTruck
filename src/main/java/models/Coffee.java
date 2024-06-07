package models;


import api.ICoffe;
import models.enums.ECoffeType;
import models.enums.EPackageType;

public class Coffee implements ICoffe {
    private final ECoffeType coffeeType;
    private final EPackageType packageType;
    private final String name;
    private final double weight;
    private final double price;

    public Coffee(String name, double weight, double price, ECoffeType coffeeType, EPackageType packageType) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.coffeeType = coffeeType;
        this.packageType = packageType;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice(){
        return price + packageType.getPrice();
    }

    public double getTotalWeight(){
        return weight + packageType.getWeight();
    }
    public int getQuality(){
        return coffeeType.getQuality();
    }

    @Override
    public String toString() {
        return  name + ", " + coffeeType + ", вес с упаковкой = " + getTotalWeight()
                + ", цена = " + getTotalPrice() ;
    }
}
