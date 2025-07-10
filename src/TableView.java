import javax.swing.*;
import java.awt.*;

public class TableView extends JPanel {
    private final BoardView boardView;
    private final DeckView deckView;
    private final DiscardView discardView;

    public TableView(Board board, Deck deck, Discard discard) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        boardView = new BoardView(board);
        deckView = new DeckView(deck);
        discardView = new DiscardView(discard);

        add(Box.createHorizontalGlue());
        add(deckView);
        add(Box.createHorizontalGlue());
        add(boardView);
        add(Box.createHorizontalGlue());
        add(discardView);
        add(Box.createHorizontalGlue());
    }

    public void update() {
        boardView.update();
        deckView.update();
        discardView.update();
    }
}
