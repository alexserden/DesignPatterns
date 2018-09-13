package decorator;

public class General extends ArmyDecorator {
    public General(Army army) {
        super(army);
    }

    @Override
    public String giveCommand() {
        return "Генерал отдал команду...";
    }
}
