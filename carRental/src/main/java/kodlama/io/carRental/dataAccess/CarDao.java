package kodlama.io.carRental.dataAccess;

import kodlama.io.carRental.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<Car, Integer> {
  List <Car> findById(int id);

  List<Car> getAll();

}
