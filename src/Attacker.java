public class Attacker extends Player {
    public Attacker() {
        super();
    }

    public boolean playCard() {
        return false;
    }

    public PlayerType getPlayerType() {
        return PlayerType.ATTACKER;
    }
}
