package kodlama.io.carRental.entities;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Table(name="car")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    private int brandId;
//    private int colorId;

    @Column(name="model_year")
    private String modelYear;
    @Column(name="daily_price")
    private double dailyPrice;
    @Column(name="description")
    private String description;

}
