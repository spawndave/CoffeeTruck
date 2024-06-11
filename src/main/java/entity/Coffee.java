package entity;


import entity.enums.ECoffeType;
import entity.enums.EPackageType;
import business.service.CoffeeService;

public class Coffee {
    private final long id;
    private final ECoffeType coffeeType;
    private final EPackageType packageType;
    private final String name;
    private final double weight;
    private final double price;

    public Coffee(long id,String name, double weight, double price, ECoffeType coffeeType, EPackageType packageType) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.coffeeType = coffeeType;
        this.packageType = packageType;
    }


    public double getPrice() {
        return price;
    }

    public int getQuality(){
        return coffeeType.getQuality();
    }

    public double getWeight() {
        return weight;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EPackageType getPackageType() {
        return packageType;
    }

    @Override
    public String toString() {
        return  name + ", " + coffeeType + ", вес с упаковкой = " + CoffeeService.getTotalWeight(this)
                + ", цена = " + CoffeeService.getTotalPrice(this);
    }
}
