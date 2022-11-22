package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;



public interface CarService {
    public List<Car> getCar();
    public List<Car> countCars(int count);

}
