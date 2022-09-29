package kodlama.io.carRental.controllers;

import kodlama.io.carRental.business.CarManager;
import kodlama.io.carRental.entities.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping
@AllArgsConstructor

public class CarsController {
    private CarManager carManager;
    @GetMapping("/getall")
    public List<Car> getAll(){
        return carManager.getAll();
    }

}
