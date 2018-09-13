package decorator;

public class Colonel extends ArmyDecorator {

    public Colonel(Army army) {
        super(army);
    }
   public String takeCommand(){
        return super.giveCommand()+"  " +giveCommand();
    }
    public String giveCommand() {
      return   "Полковник отдал команду...";
    }
}
