package kodlama.io.carRental.business;

import kodlama.io.carRental.dataAccess.CarDao;
import kodlama.io.carRental.entities.Car;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class CarManager {

    private final CarDao carDao;
    public List<Car> getAll(){
        return carDao.getAll();
    }

}
