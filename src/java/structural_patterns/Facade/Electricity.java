package Facade;

public class Electricity {
    public boolean active;
    public boolean isActive(){
        return active;
    }
    public void switchOn(){
        System.out.println("электричество включено...");
        active = true;
    }
    public void switchOff(){
        System.out.println("электричество выключено...");
        active = false;
    }
}
