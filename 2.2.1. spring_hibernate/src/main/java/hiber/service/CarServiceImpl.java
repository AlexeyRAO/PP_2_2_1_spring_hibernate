package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    @Transactional
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Car> listCars() {
        return carDao.listUsers();
    }
}
