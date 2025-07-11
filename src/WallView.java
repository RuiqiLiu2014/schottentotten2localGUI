import javax.swing.*;
import java.awt.*;
import java.util.List;

public class WallView extends JPanel {
    private final Wall wall;
    public static final int OVERALL_HEIGHT = Constants.WINDOW_HEIGHT - 3 * Constants.CARD_HEIGHT;
    public static final int WALL_WIDTH = Constants.CARD_WIDTH;
    public static final int WALL_HEIGHT = 50;

    public WallView(Wall wall) {
        this.wall = wall;
        setLayout(null);
        setPreferredSize(new Dimension(Constants.CARD_WIDTH, OVERALL_HEIGHT));
        setOpaque(true);

        List<Card> topCards = wall.getDefenderCards();
        for (int i = 0; i < topCards.size(); i++) {
            CardView cardView = new CardView(topCards.get(i));
            cardView.setBounds(0, (OVERALL_HEIGHT - WALL_HEIGHT) / 2 - i * Constants.OVERLAP - Constants.OVERLAP / 2, Constants.CARD_WIDTH, Constants.CARD_HEIGHT);
            add(cardView);
        }

        JLabel label = new JLabel(("[" + wall.getPattern().getSymbol() + "]").repeat(wall.getLength()), SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 15));
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        label.setBounds(0, (OVERALL_HEIGHT - WALL_HEIGHT) / 2, WALL_WIDTH, WALL_HEIGHT);
        add(label);

        List<Card> bottomCards = wall.getAttackerCards();
        for (int i = 0; i < bottomCards.size(); i++) {
            CardView cardView = new CardView(bottomCards.get(i));
            cardView.setBounds(0, (OVERALL_HEIGHT + WALL_HEIGHT) / 2 + i * Constants.OVERLAP + Constants.OVERLAP / 2, Constants.CARD_WIDTH, Constants.CARD_HEIGHT);
            add(cardView);
        }
    }
}
