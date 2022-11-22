package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList;


    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "BMW", "black"));
        carList.add(new Car(2, "Meren", "white"));
        carList.add(new Car(3, "bymer", "green"));
        carList.add(new Car(4, "jeep", "blue"));
        carList.add(new Car(5, "kia", "orange"));
    }
    @Override
    public List<Car> getCar() {
       return carList;
    }

    @Override
    public List<Car> countCars(int count) {
       List<Car> countCars = new ArrayList<>();
        if (count >= carList.size()){
            return carList;
        } else {
            for (int i = 1; i <= count; i++){
                countCars.add(carList.get(i));
            }
            return countCars;
        }
    }


}
