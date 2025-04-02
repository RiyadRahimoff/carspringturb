package az.it.hamburg.carspringproject.dao.repository;

import az.it.hamburg.carspringproject.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
