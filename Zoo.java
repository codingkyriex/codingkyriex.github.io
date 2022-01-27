package andriod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo implements function {
    private int DayCost = 0;
    private int DayEarn = 0;
    List animals = new ArrayList();
    List tourists = new ArrayList();
    Integer bank;

    public Zoo(Integer bank) {
        this.bank = bank;
    }

    @Override
    public void raise(animal a) {
        animals.add(a);
        bank -= (int) a.price;
        DayCost += (int) a.price;
    }

    @Override
    public void welcome(tourist a) {
        tourists.add(a);
        int t = a.getVisitCnt();
        System.out.println(a.getName());
        while (t > 0) {
            if (animals.size() == 0) {
                throw new AnimalNotFoundException("没有动物可以观看");
            }
            int random = (int) (Math.random() * (animals.size()));
            Object aaa = animals.get(random);
            animal bbb = (animal) aaa;
            if (a.getMoney() - bbb.getvisitPrice() < 0) {
                System.out.println("对不起,余额不足");
                break;
            } else {
                System.out.println(bbb);
                bank += bbb.getvisitPrice();
                DayEarn += bbb.getvisitPrice();
                a.costMoney(bbb.getvisitPrice());
            }
            t--;
        }
        System.out.println("观看已结束");
    }

    @Override
    public void close() {
        Iterator iterator = tourists.iterator();
        if (bank > DayCost) {
            System.out.println("游客\t现金\t");
            while (iterator.hasNext()) {
                Object nextTourist = iterator.next();
                tourist ccc = (tourist) nextTourist;
                System.out.println(ccc.getName() + "\t" + ccc.getMoney() + "\t");
            }
            System.out.println("今日收益" + DayEarn + "  今日花费" + DayCost);
        } else {
            throw new InsufficientBalanceException("开销大于储备,离破产再进一步.");
        }
        DayCost = 0;
        DayEarn = 0;
    }
}
