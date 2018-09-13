package Facade;

public class Computer {
    public void doWorkBeforeElectricity(Electricity electricity){
        if(electricity.isActive()) {
            System.out.println("Компьютер начинает работать ...");
        }else {
            System.out.println("Компьютер не подключен ...");
        }
    }
}
