package andriod;

public class shark extends animal {
    private final int visitPrice = 350;

    public shark(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    @Override
    public String toString() {
        return "shark{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", visitPrice=" + visitPrice +
                '}';
    }

    @Override
    public int getvisitPrice() {
        return visitPrice;
    }
}
