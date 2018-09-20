package strategy;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human();

        human.setAction(new Eat());
        human.executeAction();

        human.setAction(new Trening());
        human.executeAction();

        human.setAction(new Sleep());
        human.executeAction();

    }
}
