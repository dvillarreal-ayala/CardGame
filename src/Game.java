public class Game
{
    public static void main(String[] args) {
        System.out.println("talk to myself just to hear what a real one thinks");
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck decks = new Deck(ranks, suits, values);
        System.out.println(decks.getCardsLeft());
        System.out.println(decks.deal());
        System.out.println("talk to myself just to hear what a real one thinks");

    }
}
