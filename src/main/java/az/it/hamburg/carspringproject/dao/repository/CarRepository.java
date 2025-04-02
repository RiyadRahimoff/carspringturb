package az.it.hamburg.carspringproject.dao.repository;

import az.it.hamburg.carspringproject.dao.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity,Long> {
}
