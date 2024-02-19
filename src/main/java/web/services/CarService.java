package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Golf", 2000, 102));
        cars.add(new Car("Corolla", 2000, 95));
        cars.add(new Car("Civic", 1999, 130));
        cars.add(new Car("Almera", 1998, 93));
        cars.add(new Car("Megane", 1998, 105));
    }

    public List<Car> showCountCars(int n) {
        List<Car> showCars = new ArrayList<>();
        try {
            showCars = cars.stream().limit(n).toList();
        } catch (IllegalArgumentException e) {
            showCars = cars;
        }
        return showCars;
    }
}
