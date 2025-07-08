import javax.swing.*;
import java.awt.*;

public class HandView extends JPanel {
    private final Player player;
    private CardContainer selectedCard = null;

    public HandView(Player player) {
        this.player = player;
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); // negative hgap makes cards overlap
        update();
    }

    public void update() {
        removeAll();
        for (Card card : player.getHand().getCards()) {
            add(new CardContainer(card, player.getPlayerType() == PlayerType.DEFENDER, this));
        }
        revalidate();
        repaint();
    }

    public void notifyCardClicked(CardContainer clickedCard) {
        if (selectedCard != null && selectedCard != clickedCard) {
            selectedCard.unPop();
        }
        selectedCard = clickedCard;
    }
}
