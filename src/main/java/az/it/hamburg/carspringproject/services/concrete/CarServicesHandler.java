package az.it.hamburg.carspringproject.services.concrete;

import az.it.hamburg.carspringproject.dao.entity.CarEntity;
import az.it.hamburg.carspringproject.dao.repository.CarRepository;
import az.it.hamburg.carspringproject.services.abstraction.CarServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CarServicesHandler implements CarServices {
   private final CarRepository carRepository;

    @Override
    public void saveCar(CarEntity carEntity) {
        carRepository.save(carEntity);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public List<CarEntity> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public CarEntity findCarById(Long id) {
        return carRepository.findById(id).orElseThrow();
    }
}
