package az.it.hamburg.carspringproject.services.abstraction;

import az.it.hamburg.carspringproject.dao.entity.CarEntity;

import java.util.List;

public interface CarServices {
    void saveCar(CarEntity carEntity);

    void deleteCar(Long id);

    List<CarEntity> getAllCars();

    CarEntity findCarById(Long id);

}
