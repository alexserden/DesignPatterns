package factorymethod;

public class TornadoFactory implements RocketsFactory {
    @Override
    public Rockets createRockets() {
        return new Tornado();
    }
}
