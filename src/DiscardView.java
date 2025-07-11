import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

public class DiscardView extends JPanel {
    private final Discard discard;

    public DiscardView(Discard discard) {
        this.discard = discard;
        setLayout(new GridLayout(1, 5, 10, 0));
        update();
    }

    public void update() {
        removeAll();
        Map<CardColor, List<Card>> cardsByColor = discard.getCardsByColor();
        for (CardColor color : cardsByColor.keySet()) {
            List<Card> cards = cardsByColor.get(color);
            JPanel column = new JPanel();
            column.setLayout(null);
            for (int i = 0; i < cards.size(); i++) {
                CardView cardView = new CardView(cards.get(i));
                cardView.setBounds(0, i * Constants.OVERLAP, Constants.CARD_WIDTH, Constants.CARD_HEIGHT);
            }
            add(column);
        }
    }
}
