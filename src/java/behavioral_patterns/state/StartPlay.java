package state;

public class StartPlay implements State {
    @Override
    public void doSomething(Game game) {
        System.out.println("Start play ...");
        game.setState(this);
    }

    @Override
    public String toString() {
        return "StartPlay{}";
    }
}
