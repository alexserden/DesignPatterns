package factorymethod;

public class TopolFactory implements RocketsFactory {
    @Override
    public Rockets createRockets() {
        return new Topol();
    }
}
