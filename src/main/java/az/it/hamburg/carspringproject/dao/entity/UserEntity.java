package az.it.hamburg.carspringproject.dao.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String username;

    private String surname;

    @CreationTimestamp
    private LocalDateTime created_at;
    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
    private List<CarEntity> cars = new ArrayList<>();

}
