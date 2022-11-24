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
        carList.add(new Car(123, "BMW", "black"));
        carList.add(new Car(234, "Meren", "white"));
        carList.add(new Car(345, "bymer", "green"));
        carList.add(new Car(456, "jeep", "blue"));
        carList.add(new Car(567, "kia", "orange"));
        carList.add(new Car(678, "kia", "orange"));
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
            for (int i = 0; i <= count-1; i++){
                countCars.add(carList.get(i));
            }
            return countCars;
        }
    }
    public void save(Car car){
        carList.add(car);
    }




}
