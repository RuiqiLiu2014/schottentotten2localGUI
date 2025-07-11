import java.util.*;

public class PlayResult {
    private final boolean success;
    private final List<Card> toDiscard;

    public PlayResult(boolean success) {
        this(success, null);
    }

    public PlayResult(boolean success, List<Card> toDiscard) {
        this.success = success;
        this.toDiscard = toDiscard == null ? new ArrayList<>() : toDiscard;
    }

    public boolean wasSuccessful() {
        return success;
    }

    public List<Card> getToDiscard() {
        return toDiscard;
    }
}
