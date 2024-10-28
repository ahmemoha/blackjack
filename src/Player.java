import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in the game of Blackjack.
 */
public class Player {
    private List<Card> hand;
    private int money;
    private int bet;

    /**
     * Constructs a player with an initial amount of money and zero bet.
     */
    public Player() {
        hand = new ArrayList<>();
        money = 10000;
        bet = 0;
    }

    /**
     * Places a bet for the player.
     *
     * @param amount The amount to bet.
     */
    public void placeBet(int amount) {
        bet = Math.min(amount, money);
    }

    /**
     * Wins the current bet for the player.
     */
    public void winBet() {
        money += bet;
        bet = 0;
    }

    /**
     * Loses the current bet for the player.
     */
    public void loseBet() {
        money -= bet;
        bet = 0;
    }

    /**
     * Clears the player's hand.
     */
    public void clearHand() {
        hand.clear();
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card The card to add.
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Gets the player's hand.
     *
     * @return The player's hand.
     */
    public List<Card> getHand() {
        return hand;
    }

    /**
     * Gets the player's current money.
     *
     * @return The player's money.
     */
    public int getMoney() {
        return money;
    }

    /**
     * Gets the player's current bet.
     *
     * @return The player's bet.
     */
    public int getBet() {
        return bet;
    }
}
