package az.it.hamburg.carspringproject.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private Integer year;
    @CreationTimestamp
    private LocalDateTime created_at;
    @ManyToOne
    private UserEntity userEntity;
}
