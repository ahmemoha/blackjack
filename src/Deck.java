import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of playing cards for the game of Blackjack.
 */
public class Deck {
    private List<Card> cards;
    /**
     * Constructs a shuffled deck of cards.
     */
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }

        Collections.shuffle(cards);
    }

    /**
     * Draws a card from the deck.
     *
     * @return The drawn card or null if the deck is empty.
     */
    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // Deck is empty
        }
        return cards.remove(0);
    }
}
