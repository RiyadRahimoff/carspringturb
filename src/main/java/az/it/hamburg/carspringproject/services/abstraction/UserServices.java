package az.it.hamburg.carspringproject.services.abstraction;

import az.it.hamburg.carspringproject.dao.entity.UserEntity;

import java.util.List;

public interface UserServices {
    void saveUser(UserEntity userEntity);

    void deleteUser(Long id);

    List<UserEntity> getAllUsers();

    UserEntity findUserById(Long id);
}
