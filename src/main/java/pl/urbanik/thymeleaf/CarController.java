package pl.urbanik.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class CarController {

    @RequestMapping("/car")
    public String getCar(Model model)
    {
        Car car = new Car("X5", "BMW");
        model.addAttribute("car", car );
        return "car";
    }


}
