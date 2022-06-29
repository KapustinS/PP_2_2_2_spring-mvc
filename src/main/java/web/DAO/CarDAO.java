package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("FORD", "Grey", "1.6"));
        carList.add(new Car("AUDI", "Red", "1.8"));
        carList.add(new Car("LADA", "Brown", "1.5"));
        carList.add(new Car("ASTON MARTIN", "White", "2.2"));
        carList.add(new Car("JEEP", "Green", "3.0"));
    }

    public List<Car> getCarList(int count){
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getCarList() {
        return carList;
    }
}
