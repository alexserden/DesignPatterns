package state;

public class FinishPlay implements State{
    @Override
    public void doSomething(Game game) {
        System.out.println("Finish play ...");
        game.setState(this);
    }

    @Override
    public String toString() {
        return "FinishPlay{}";
    }
}
