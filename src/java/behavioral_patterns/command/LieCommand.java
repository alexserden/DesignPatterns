package command;

public class LieCommand implements Command {
    Dog dog;

    public LieCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.lie();
    }
}
