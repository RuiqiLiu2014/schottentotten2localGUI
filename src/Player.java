import java.util.*;

public abstract class Player {
    protected Hand hand;

    public Player() {
        hand = new Hand();
    }

    public void draw(Deck deck) {
        Card card = deck.pop();
        if (card != null) {
            hand.add(card);
        }
    }

    public Hand getHand() {
        return hand;
    }

    public abstract boolean playCard();

    public abstract PlayerType getPlayerType();
}