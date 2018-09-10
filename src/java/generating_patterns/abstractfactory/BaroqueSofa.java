package abstractfactory;

import abstractfactory.intf.Sofa;

public class BaroqueSofa implements Sofa {

    @Override
    public void getSofa() {
        System.out.println("Шкаф в стиле Барокко");
    }
}
