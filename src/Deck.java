import java.util.ArrayList;

/**
 * Created by Damian Villarreal-Ayala on Dec 1, 2022 for CS2.
 */
public class Deck
{
    private ArrayList<Card> cards;
    private int cardsLeft;
    private int dealer;

    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<Card>();
        for(int i = 0; i < suits.length; i++)
        {
            for(int j = 0; j < ranks.length; j++)
            {
                Card card = new Card(suits[i], ranks[j], values[j]);
                cards.add(card);
                cardsLeft++;
            }
        }
        dealer = cardsLeft - 1;
    }

    public boolean isEmpty()
    {
        if(cardsLeft > 0)
        {
            return false;
        }
        return true;
    }
    public int getCardsLeft()
    {
        return cardsLeft;
    }

    public Card deal()
    {
        if(cards.isEmpty())
        {
            return null;
        }
        return cards.get(dealer--);
    }

    public void shuffle()
    {
        dealer = cardsLeft - 1;
        //banana fr fr
        for(int i = cardsLeft - 1; i > 0; i--)
        {
            int rnum = (int) (Math.random() * i);
//            Card temp = cards.remove(i);
            cards.add(rnum + 1, cards.remove(i));
            cards.add(i, cards.remove(rnum));
        }
    }
}
