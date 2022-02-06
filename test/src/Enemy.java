public abstract class Enemy extends Character {
    private static double turnPercentage = 0.05;

    public Enemy(int x, int y) {
        super(x, y);
    }

    public void nextMove() {
        if ((deltaX != 0 || deltaY != 0) && Math.random() > turnPercentage)
            return;

        switch ((int) (Math.random() * 4)) {
            case 0: deltaX = -1; deltaY = 0; break;
            case 1: deltaX = 1; deltaY = 0; break;
            case 2: deltaX = 0; deltaY = -1; break;
            case 3: deltaX = 0; deltaY = 1; break;
        }
    }
}
