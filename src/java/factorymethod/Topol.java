package factorymethod;

public class Topol implements Rockets {
    @Override
    public void rocketLaunch() {
        System.out.println("Ракета запущена...");
        System.out.println();
        System.out.println("~>|-------->");
        System.out.println("~>|--TOPOL-->");
        System.out.println("~>|-------->");
    }
}
