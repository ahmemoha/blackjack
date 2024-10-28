import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a playing card with a suit and rank.
 */
public class Card {
    private String suit;
    private String rank;
    /**
     * Constructs a Card with the specified suit and rank.
     *
     * @param suit The suit of the card.
     * @param rank The rank of the card.
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Returns a string representation of the card.
     *
     * @return A string representing the card, e.g., "Ace of Hearts".
     */
    public String toString() {
        return rank + " of " + suit;
    }

    /**
     * Returns the numerical value of the card for the game of Blackjack.
     *
     * @return The value of the card.
     */
    public int getValue() {
        switch (rank) {
            case "Ace":
                return 11;
            case "King":
            case "Queen":
            case "Jack":
                return 10;
            default:
                return Integer.parseInt(rank);
        }
    }
}

/**
 * Represents a deck of playing cards for the game of Blackjack.
 */
class Deck {
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
