package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
public class CarController {

    private final CarDAO carDAO;
    private static final int MAX_COUNT_CARS = 5;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping({"/cars"})
    public String showCars(@RequestParam(value = "count", required = false) Integer count,
                           Model model) {
        if (count == null) {
            count = MAX_COUNT_CARS;
        }
        model.addAttribute("carList", carDAO.getCarList(count));
        return "cars";
    }
}
