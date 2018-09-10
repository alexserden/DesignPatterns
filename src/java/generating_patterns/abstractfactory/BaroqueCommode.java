package abstractfactory;

import abstractfactory.intf.Commode;

public class BaroqueCommode implements Commode {
    @Override
    public void getCommode() {
        System.out.println("Коммод в стиле Барокко");
    }
}
