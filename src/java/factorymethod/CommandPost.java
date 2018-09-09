package factorymethod;

public class CommandPost {
    public static void main(String[] args) {
        RocketsFactory factoryRockets = createRocketByType("Typhoon");
        Rockets rockets = factoryRockets.createRockets();
        rockets.rocketLaunch();
    }

    static RocketsFactory createRocketByType(String type) {
        switch (type) {
            case "Topol":
                return new TopolFactory();
            case "Tornado":
                return new TornadoFactory();
            case "Typhoon":
                return new TyphoonFactory();
        }
        throw new RuntimeException("такой ракеты не существует");
    }

}
