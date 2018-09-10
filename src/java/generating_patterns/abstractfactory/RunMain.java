package abstractfactory;

import abstractfactory.intf.FurnitureFactory;

public class RunMain {
    public static void main(String[] args) {
        FurnitureFactory factory = new BaroqueFurnitureFactory();
        factory.createCommode().getCommode();
    }
}
