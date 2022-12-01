import java.util.ArrayList;

/**
 * Created by Damian Villarreal-Ayala on Dec 1, 2022 for CS2.
 */
public class Deck
{
    private ArrayList<Card> cards;
    private int cardsLeft;

    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<Card>();
    }
}
