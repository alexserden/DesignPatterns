package abstractfactory;

import abstractfactory.intf.Sofa;

public class GothicSofa implements Sofa {
    @Override
    public void getSofa() {
        System.out.println("Шкаф в стиле Готика");
    }
}
