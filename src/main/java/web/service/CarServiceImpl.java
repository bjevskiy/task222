package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarDao;
import web.repository.CarDaoImpl;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    private List<Car> cars = CarDaoImpl.getAllCars();

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
