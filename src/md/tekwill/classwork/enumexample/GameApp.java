package md.tekwill.classwork.enumexample;

public class GameApp {

    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.gameLevel = Level.ADVANCED;

        Level l1 = Level.NOVICE;
        switch (l1) {
            case NOVICE:
                System.out.println(Level.NOVICE);
                break;
            case ADVANCED:
                System.out.println(Level.ADVANCED.name());
                break;
            case BEGINNER:
                System.out.println(Level.BEGINNER);
                break;
        }

    }
}
