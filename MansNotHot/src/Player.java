import bc.GameController;

public class Player {
    public static void main(String[] args) {
        GameController gc = new GameController();
        GameManager manager = new GameManager(gc);
        while (true) {
            manager.gameStep();
        }
    }
}
