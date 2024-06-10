package entity;


public final class TruckDriver {
    private double money;
    private final Truck truck;

    public TruckDriver(double money, double maxWeight) {
        this.truck = new Truck(maxWeight);
        this.money = money;
    }

    public Truck getTruck() {
        return truck;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
