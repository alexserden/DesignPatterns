package abstractfactory;

import abstractfactory.intf.Commode;
import abstractfactory.intf.FurnitureFactory;
import abstractfactory.intf.Sofa;

public class BaroqueFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new BaroqueSofa();
    }

    @Override
    public Commode createCommode() {
        return new BaroqueCommode();
    }
}
