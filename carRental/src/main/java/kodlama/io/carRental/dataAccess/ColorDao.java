package kodlama.io.carRental.dataAccess;

import kodlama.io.carRental.entities.Car;
import kodlama.io.carRental.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColorDao extends JpaRepository<Color, Integer> {
    List <Color> findById(int id);
}
