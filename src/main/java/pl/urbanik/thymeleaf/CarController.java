package pl.urbanik.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @RequestMapping("/car")
    public String getCar(Model model)
    {
        Car car = new Car("X5", "BMW");
        Car car1 = new Car("X5", "Fiat");
        Car car2 = new Car("X5", "Ferrari");
        Car car3 = new Car("X5", "Hiunday");
        Car car4 = new Car("X5", "Skoda");

        List<Car> carList = Arrays.asList(car, car1, car2, car3, car4);
        model.addAttribute("cars", carList);
        model.addAttribute("car", car );


        return "car";
    }


}
