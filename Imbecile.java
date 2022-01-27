package andriod;

public class Imbecile extends animal {
    private final int VisitPrice = 114;

    public Imbecile(String name, int age, String sex, double price) {
        super(name, age, sex, price);
    }

    @Override
    public int getvisitPrice() {

        return VisitPrice;
    }

    @Override
    public String toString() {
        return "Imbecile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price + ",visitPrice=" + VisitPrice +
                '}';
    }
}
