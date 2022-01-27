package andriod;

public class panda extends animal{
    private boolean isFat;
    private final int visitPrice=200;
    public panda(String name, int age, String sex, double price, boolean isFat) {
        super(name, age, sex, price);
        this.isFat = isFat;
    }
    public void setFat(boolean fat) {
        isFat = fat;
    }
    public boolean isFat() {
        return isFat;
    }

    @Override
    public int getvisitPrice() {
        return visitPrice;
    }

    @Override
    public String toString() {
        return "panda{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isFat=" + isFat +
                ", visitPrice=" + visitPrice +
                '}';
    }
}
