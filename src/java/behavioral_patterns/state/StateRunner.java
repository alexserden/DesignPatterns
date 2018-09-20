package state;

public class StateRunner {
    public static void main(String[] args) {
        Game game = new Game();

        StartPlay startPlay = new StartPlay();
        startPlay.doSomething(game);

        System.out.println(game.getState().toString());

        FinishPlay stopState = new FinishPlay();
        stopState.doSomething(game);

        System.out.println(game.getState().toString());
    }
}
