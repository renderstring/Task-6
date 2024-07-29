package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        cars.add(new Car("Toyota", "Supra", "Gray"));
        cars.add(new Car("Lexus", "IS300", "Black"));
        cars.add(new Car("Subaru", "Impreza", "Blue"));
        cars.add(new Car("Nissan", "Silvia", "White"));
        cars.add(new Car("Toyota", "Chaser", "Black"));

        return cars;
    }
}
