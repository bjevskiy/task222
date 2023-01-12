package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.ArrayList;

@Repository
public class CarDaoImpl implements CarDao {
    public static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Car 1", 55, 34));
        cars.add(new Car("Car 2", 11, 48));
        cars.add(new Car("Car 3", -23, -3));
        cars.add(new Car("Car 4", 5, 53));
        cars.add(new Car("Car 5", 35, 0));
    }
}
