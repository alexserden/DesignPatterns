package command;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Human human = new Human(new BarkCommand(dog),new SitCommand(dog),new LieCommand(dog));
        human.bark();
        human.sit();
        human.lie();
    }
}
