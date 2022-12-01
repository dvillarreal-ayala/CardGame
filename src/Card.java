import java.lang.reflect.Constructor;

public class Card
{
    private String suit;
    private String rank;
    private int values;

    public Card(String suits, String ranks, int value)
    {
        suit = suits;
        rank = ranks;
        values = value;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
