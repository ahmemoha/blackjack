import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents a simple Blackjack game using a graphical user interface.
 */
public class Blackjack extends JFrame {
    private Deck deck;
    private Player player;
    private Player dealer;
    private JButton hitButton;
    private JButton standButton;
    private JButton betButton;
    private JButton restartButton;
    private JTextField betTextField;
    private JLabel playerLabel;
    private JLabel dealerLabel;
    private JLabel moneyLabel;
    private JTextArea playerTextArea;
    private JTextArea dealerTextArea;

    /**
     * Constructs a Blackjack game with GUI components.
     */
    public Blackjack() {
        setTitle("Blackjack");
        setLayout(new FlowLayout());

        deck = new Deck();
        player = new Player();
        dealer = new Player();

        hitButton = new JButton("Hit");
        standButton = new JButton("Stand");
        betButton = new JButton("Place Bet");
        restartButton = new JButton("Restart");
        betTextField = new JTextField(10);
        playerLabel = new JLabel();
        dealerLabel = new JLabel();
        moneyLabel = new JLabel("Money: $" + player.getMoney());
        playerTextArea = new JTextArea(4, 30); // 4 rows, 30 columns
        dealerTextArea = new JTextArea(4, 30); // 4 rows, 30 columns

        add(hitButton);
        add(standButton);
        add(betTextField);
        add(betButton);
        add(restartButton);
        add(playerLabel);
        add(dealerLabel);
        add(moneyLabel);
        add(playerTextArea);
        add(dealerTextArea);

        hitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleHit();
            }
        });

        standButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleStand();
            }
        });

        betButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleBet();
            }
        });

        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleRestart();
            }
        });

        updateLabels();
        setSize(380, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // ... (methods omitted for brevity)

    /**
     * The main method to start the Blackjack game.
     *
     * @param args The command line arguments (ignored).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Blackjack());
    }
}
