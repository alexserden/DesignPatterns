package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    Map<String,Car> map = new HashMap<>();
        public Car getCarByType(String type){
            Car car = map.get(type);
            if(car==null){
                switch (type){
                    case "sport":
                        System.out.println("Покупаем спортивную машину...");
                        car = new Porshe();
                        break;
                    case "vaz":
                        System.out.println("Покупаем отечественный автомобиль...");
                        car = new Priora();
                        break;

                }
                map.put(type,car);
            }
            return car;
        }
}
