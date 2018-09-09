package factorymethod;

public class Tornado implements Rockets {
    @Override
    public void rocketLaunch() {
        System.out.println("Ракета запущена...");
        System.out.println();
        System.out.println("~>|-------->");
        System.out.println("~>|-TORNADO-->");
        System.out.println("~>|-------->");
    }
}
