package kodlama.io.carRental.dataAccess;

import kodlama.io.carRental.entities.Brand;
import kodlama.io.carRental.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandDao extends JpaRepository<Brand, Integer> {
    List <Brand> findById(int id);
}
