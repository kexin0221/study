package Card;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();

        System.out.print("买牌:");
        ArrayList<Cards> cardList = cardDemo.buyCards();
        System.out.println(cardList);

        System.out.print("洗牌:");
        cardDemo.shuffle(cardList);
        System.out.println(cardList);

        System.out.println("摸牌:");
        ArrayList<ArrayList<Cards>> ret = cardDemo.play(cardList);
        for (int i = 0; i < ret.size(); i++) {
            System.out.println("第"+(i+1)+"个人的牌："+ret.get(i));
        }

        System.out.println("剩下的牌:"+cardList);
    }
}
