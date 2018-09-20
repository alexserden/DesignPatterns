package command;

public class BarkCommand implements Command {
    Dog dog;

    public BarkCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.bark();
    }
}
