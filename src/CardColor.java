import java.awt.*;

public enum CardColor {
    RED(new Color(200, 46, 46)),
    BLUE(new Color(61, 165, 209)),
    YELLOW(new Color(222, 195, 76)),
    GREEN(new Color(63, 145, 55)),
    GRAY(new Color(140, 140, 140));

    private final Color color;

    CardColor(Color color) {
        this.color = color;
    }

    public Color getDisplayColor() {
        return color;
    }
}
