import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {
    private final Game game;
    private final TableView tableView;
    private final HandView attackerHandView;
    private final HandView defenderHandView;

    public GameView(Game game) {
        this.game = game;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        attackerHandView = new HandView(game.getAttacker());
        defenderHandView = new HandView(game.getDefender());
        tableView = new TableView(game.getBoard(), game.getDeck(), game.getDiscard());

        add(defenderHandView);
        add(Box.createVerticalGlue());
        add(tableView);
        add(Box.createVerticalGlue());
        add(attackerHandView);
    }

    public void updateAttackerHand() {
        attackerHandView.update();
    }

    public void updateDefenderHand() {
        defenderHandView.update();
    }

    public void updateTable() {
        tableView.update();
    }
}
