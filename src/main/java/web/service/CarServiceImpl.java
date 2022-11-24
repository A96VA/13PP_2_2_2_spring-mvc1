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
        carList.add(new Car("a", "BMW", "black"));
        carList.add(new Car("s", "Meren", "white"));
        carList.add(new Car("d", "bymer", "green"));
        carList.add(new Car("f", "jeep", "blue"));
        carList.add(new Car("g", "kia", "orange"));
        carList.add(new Car("h", "kia", "orange"));
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
    public void save(Car car){
        carList.add(car);
    }




}
