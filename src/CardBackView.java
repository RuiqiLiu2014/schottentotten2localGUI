import javax.swing.*;
import java.awt.*;

public class CardBackView extends JPanel {
    public CardBackView() {
        setPreferredSize(new Dimension(Constants.CARD_WIDTH, Constants.CARD_HEIGHT));
        setBackground(Color.BLUE);
        setOpaque(true);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
