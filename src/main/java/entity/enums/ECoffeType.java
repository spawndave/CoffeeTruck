package entity.enums;

public enum ECoffeType {
    COFFE_BEANS(1, "Кофе в зернах"),
    GROUND_COFEE(2, "Молотый кофе"),
    INSTANT_COFEE(3, "Растворимый кофе");
    private int quality;
    private String description;

    ECoffeType(int quality, String description){
        this.quality = quality;
        this.description = description;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return  description  + ", сорт = " + quality;
    }
}
