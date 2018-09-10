package abstractfactory;

import abstractfactory.intf.Commode;

public class GothicCommode implements Commode {
    @Override
    public void getCommode() {
        System.out.println("Коммод в стиле Готика");
    }
}
