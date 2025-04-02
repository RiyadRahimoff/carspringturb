package az.it.hamburg.carspringproject.controller;

import az.it.hamburg.carspringproject.dao.entity.CarEntity;
import az.it.hamburg.carspringproject.services.concrete.CarServicesHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequiredArgsConstructor
@RequestMapping("/RRavto")
public class CarController {
    private final CarServicesHandler carServicesHandler;

    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCar(@RequestBody CarEntity carEntity) {
        carServicesHandler.saveCar(carEntity);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCar(@PathVariable Long id) {
        carServicesHandler.deleteCar(id);
    }

}
