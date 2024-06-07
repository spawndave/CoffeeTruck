package models.enums;

public enum EPackageType {
    BIG_BAG(1, 3),
    MEDIUM_BAG(0.75, 2),
    SMALL_BAG(0.5, 1),
    JAR(5, 10);

    private double weight;
    private double price;

    EPackageType(double weight, double price) {
        this.price = price;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
