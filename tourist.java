package andriod;

public class tourist {
    private final String name;
    private int money;
    private final int visitCnt;

    public tourist(String name, int money, int visitCnt) {
        this.name = name;
        this.money = money;
        this.visitCnt = visitCnt;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getVisitCnt() {
        return visitCnt;
    }

    public void costMoney(int money1) {
        money -= money1;
    }

    @Override
    public String toString() {
        return "name of tourist is " +
                name +
                " He wants to see " + visitCnt +
                " kinds of animals,and has " + visitCnt +
                " dollars in cash.";
    }
}
