package Facade;

public class WorkFlow {
    private Computer computer = new Computer();
    private Working working = new Working();
    private Electricity electricity = new Electricity();

    public void startProcess(){
        working.doWork();
        electricity.switchOn();
        computer.doWorkBeforeElectricity(electricity);
    }
    public void finishProcess(){
        electricity.switchOff();
        computer.doWorkBeforeElectricity(electricity);
    }
}
