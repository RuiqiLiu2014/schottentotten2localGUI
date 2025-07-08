import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {
    private final Game game;
    private final BoardView boardView;
    private final HandView attackerHandView;
    private final HandView defenderHandView;
    private final DeckView deckView;
    private final DiscardView discardView;

    public GameView(Game game) {
        this.game = game;
        setLayout(new BorderLayout());
        boardView = new BoardView(game.getBoard());
        attackerHandView = new HandView(game.getAttacker());
        defenderHandView = new HandView(game.getDefender());
        deckView = new DeckView(game.getDeck());
        discardView = new DiscardView(game.getDiscard());

        add(boardView, BorderLayout.CENTER);
        add(attackerHandView, BorderLayout.SOUTH);
        add(defenderHandView, BorderLayout.NORTH);
        add(deckView, BorderLayout.EAST);
        add(discardView, BorderLayout.WEST);
    }

    public void updateBoard() {
        boardView.update();
    }

    public void updateAttackerHand() {
        attackerHandView.update();
    }

    public void updateDefenderHand() {
        defenderHandView.update();
    }

    public void updateDeck() {
        deckView.update();
    }

    public void updateDiscard() {
        discardView.update();
    }
}
