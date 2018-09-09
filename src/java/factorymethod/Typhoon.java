package factorymethod;

public class Typhoon implements Rockets {
    @Override
    public void rocketLaunch() {
        System.out.println("Ракета запущена...");
        System.out.println();
        System.out.println("~>|-------->");
        System.out.println("~>|-TYPHOON-->");
        System.out.println("~>|-------->");
    }
}
