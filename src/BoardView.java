import javax.swing.*;
import java.awt.*;

public class BoardView extends JPanel {
    private Board board;

    public BoardView(Board board) {
        this.board = board;
        setLayout(new GridLayout(1, Constants.NUM_WALLS));

        for (Wall wall : board.getWalls()) {
            add(new WallView(wall));
        }
    }

    public void update() {
        removeAll();
        for (Wall wall : board.getWalls()) {
            add(new WallView(wall));
        }
        revalidate();
        repaint();
    }
}
