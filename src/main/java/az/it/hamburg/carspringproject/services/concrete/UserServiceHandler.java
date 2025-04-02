package az.it.hamburg.carspringproject.services.concrete;

import az.it.hamburg.carspringproject.dao.entity.UserEntity;
import az.it.hamburg.carspringproject.dao.repository.UserRepository;
import az.it.hamburg.carspringproject.services.abstraction.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UserServiceHandler implements UserServices {
    private final UserRepository userRepository;
    @Override
    public void saveUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity findUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
