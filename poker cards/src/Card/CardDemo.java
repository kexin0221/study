package Card;

import java.util.ArrayList;
import java.util.Random;

public class CardDemo {
    public static final String[] suits = {"♥","♠","♣","♦"};

    public ArrayList<Cards> buyCards(){
        ArrayList<Cards> cardList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                int num = i + 1;
                String suit = suits[j];
                Cards card = new Cards(num,suit);
                cardList.add(card);
            }
        }
        return cardList;
    }

    public void shuffle(ArrayList<Cards> cardList){
        Random random = new Random();
        for (int i = cardList.size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swap(cardList, i, j);
        }
    }

    private void swap(ArrayList<Cards> cardList ,int i , int j){
        Cards tmp = cardList.get(i);
        cardList.set(i,cardList.get(j));
        cardList.set(j,tmp);
    }

    public ArrayList<ArrayList<Cards>> play(ArrayList<Cards> cardList){
        ArrayList<Cards> player1 = new ArrayList<>();
        ArrayList<Cards> player2 = new ArrayList<>();
        ArrayList<Cards> player3 = new ArrayList<>();

        ArrayList<ArrayList<Cards>> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                players.get(j).add(cardList.remove(0));
            }
        }
        return players;
    }
}
