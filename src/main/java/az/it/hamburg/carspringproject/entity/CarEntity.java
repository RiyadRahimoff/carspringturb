package az.it.hamburg.carspringproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    private Long id;

    private String brand;

    private String model;

    private Integer year;
    @CreationTimestamp
    private LocalDateTime created_at;
    @ManyToOne
    private UserEntity userEntity;
}
