package decorator;

public class ArmyDecorator implements Army {
    Army army;

    public ArmyDecorator(Army army) {
        this.army = army;
    }

    @Override
    public String giveCommand() {
        return army.giveCommand();
    }
}
