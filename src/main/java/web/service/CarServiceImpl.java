package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> allCars(int count) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "X5", 12));
        cars.add(new Car("BMW", "X6", 1743));
        cars.add(new Car("BMW", "X7", 153));
        cars.add(new Car("BMW", "X8", 1995));
        cars.add(new Car("BMW", "X9", 15));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
