package Card;

public class Cards {
    public int num;
    public String suit;

    public Cards(int num, String suit) {
        this.num = num;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "[" + num + suit + "]";
    }
}
