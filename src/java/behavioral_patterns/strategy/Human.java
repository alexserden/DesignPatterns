package strategy;

public class Human {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }
    public void executeAction(){
        action.doSomething();
    }
}
