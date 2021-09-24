package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("nissan",2010));
        listCar.add(new Car("kia",2011));
        listCar.add(new Car("BMW",2012));
        listCar.add(new Car("Mercedes",2020));
        listCar.add(new Car("toyota",1994));
    }
    @Override
    public List<Car> getCars(int count) {
        return listCar.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
