import java.util.*;

public class Wall {
    private Status status;
    private int length;
    private final int intactLength;
    private final int damagedLength;
    private WallPattern pattern;
    private final WallPattern intactPattern;
    private final WallPattern damagedPattern;

    private final List<Card> attackerCards;
    private final List<Card> defenderCards;

    public enum Status {
        BROKEN, DAMAGED, INTACT
    }

    public Wall(int intactLength, int damagedLength, WallPattern intactPattern, WallPattern damagedPattern) {
        this.status = Status.INTACT;
        this.intactLength = intactLength;
        this.damagedLength = damagedLength;
        this.intactPattern = intactPattern;
        this.damagedPattern = damagedPattern;
        this.length = intactLength;
        this.pattern = intactPattern;

        this.attackerCards = new ArrayList<>();
        this.defenderCards = new ArrayList<>();
    }

    public boolean contains(Card card) {
        return attackerCards.contains(card) || defenderCards.contains(card);
    }

    public void reset() {
        attackerCards.clear();
        defenderCards.clear();
        status = Status.INTACT;
        length = intactLength;
        pattern = intactPattern;
    }

    public List<Card> getAttackerCards() {
        return attackerCards;
    }

    public List<Card> getDefenderCards() {
        return defenderCards;
    }

    public Status getStatus() {
        return status;
    }

    public WallPattern getPattern() {
        return pattern;
    }

    public int getLength() {
        return length;
    }

    public Set<Card> damage() {
        if (status == Status.DAMAGED) {
            status = Status.BROKEN;
        } else {
            status = Status.DAMAGED;
            length = damagedLength;
            pattern = damagedPattern;
        }
        Set<Card> toDiscard = new TreeSet<>(attackerCards);
        toDiscard.addAll(defenderCards);
        attackerCards.clear();
        defenderCards.clear();
        return toDiscard;
    }
}
