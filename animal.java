package andriod;

public abstract class animal {
    protected String name;
    protected int age;
    protected String sex;
    protected double price;

    public animal(String name, int age, String sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    @Override
    public abstract String toString();

    public abstract int getvisitPrice();
}
