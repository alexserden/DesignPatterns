package abstractfactory;

import abstractfactory.intf.Commode;
import abstractfactory.intf.FurnitureFactory;
import abstractfactory.intf.Sofa;

public class GothicFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new GothicSofa();
    }

    @Override
    public Commode createCommode() {
        return new GothicCommode();
    }
}
