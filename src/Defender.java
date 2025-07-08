public class Defender extends Player {
    public Defender() {
        super();
    }

    public boolean playCard() {
        return false;
    }

    public PlayerType getPlayerType() {
        return PlayerType.DEFENDER;
    }
}
