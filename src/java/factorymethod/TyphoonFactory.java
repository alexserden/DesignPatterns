package factorymethod;

public class TyphoonFactory implements RocketsFactory {
    @Override
    public Rockets createRockets() {
        return new Typhoon();
    }
}
