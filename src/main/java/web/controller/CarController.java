package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDao;

@Controller

public class CarController {

    @Autowired
    CarDao carDao ;

    @GetMapping("/cars")
    public String allCars(ModelMap model, @RequestParam(value = "count",defaultValue = "5") int count) {
        model.addAttribute("cars", carDao.getCars(count));
        return "allCars";
    }


}
