import javax.swing.*;
import java.awt.*;

public class BoardView extends JPanel {
    private final Board board;

    public BoardView(Board board) {
        this.board = board;
        int hgap = 15;
        setLayout(new FlowLayout(FlowLayout.CENTER, hgap, 0));
        setMaximumSize(new Dimension(Constants.NUM_WALLS * WallView.WALL_WIDTH + (Constants.NUM_WALLS - 1) * hgap, WallView.OVERALL_HEIGHT));

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
