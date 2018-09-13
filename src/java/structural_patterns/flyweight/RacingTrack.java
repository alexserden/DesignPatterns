package flyweight;

import java.util.ArrayList;
import java.util.List;

public class RacingTrack {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        List<Car> cars = new ArrayList<>();

        cars.add(carFactory.getCarByType("sport"));
        cars.add(carFactory.getCarByType("sport"));
        cars.add(carFactory.getCarByType("sport"));
        cars.add(carFactory.getCarByType("sport"));
        cars.add(carFactory.getCarByType("sport"));
        cars.add(carFactory.getCarByType("vaz"));
        cars.add(carFactory.getCarByType("vaz"));
        cars.add(carFactory.getCarByType("vaz"));
        cars.add(carFactory.getCarByType("vaz"));
        cars.add(carFactory.getCarByType("vaz"));

        for(Car c : cars){
            c.rides();
        }
    }
}
