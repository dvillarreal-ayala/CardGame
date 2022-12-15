import java.util.ArrayList;

public class Player
{
    private String name;
    private ArrayList<Card> hand;
    private int points;

    public Player(String alias)
    {
        name = alias;
        hand = new ArrayList<Card>();
        points = 0;
    }

    public Player(String alias, ArrayList<Card> deck)
    {
        name = alias;
        for(int i = 0; i < deck.size();i++)
        {
            hand.add(deck.get(i));
        }
        points = 0;
    }


}
