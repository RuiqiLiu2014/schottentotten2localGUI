public class Board {
    private final Wall[] walls;

    public Board() {
        walls = new Wall[Constants.NUM_WALLS];
        for (int i = 0; i < Constants.NUM_WALLS; i++) {
            walls[i] = new Wall(Constants.WALL_LENGTHS[i], Constants.DAMAGED_WALL_LENGTHS[i], Constants.WALL_PATTERNS[i], Constants.DAMAGED_WALL_PATTERNS[i]);
        }
    }

    public void clear() {
        for (Wall wall : walls) {
            wall.reset();
        }
    }

    public Wall[] getWalls() {
        return walls;
    }

    public boolean contains(Card card) {
        for (Wall wall : walls) {
            if (wall.contains(card)) {
                return true;
            }
        }
        return false;
    }
}
