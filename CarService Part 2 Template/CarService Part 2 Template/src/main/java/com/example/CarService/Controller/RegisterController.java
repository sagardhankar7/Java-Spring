//package com.example.CarService.Controller;
//
//
//import com.example.CarService.domain.Car;
//import com.example.CarService.domain.Vehicle;
//import com.example.CarService.service.Registration;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class RegisterController {
//    @Autowired
//    Registration registration;
//
//    @RequestMapping("/register")
//    public String getRegistrationPage(Model carModel){
//        Vehicle vehicle=registration.getNewCar();
//        //carModel.addAttribute("Vehicle",vehicle);
//        carModel.addAttribute("car", vehicle);
//        return "carregister";
//    }
//    @RequestMapping("/done")
//    public String getResponsePage(@ModelAttribute("car") Car car){
//        if(registration.registerCar(car.getRegisterationNumber(),car.getCarName(),car.getCarDetails(), car.getCarWork())){
//            return "success";
//        }else{
//            return "carregister";
//        }
//    }
//}
//
//

//==================================================

package com.example.CarService.Controller;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @Autowired
    Registration registration;

/**
 1. Modify the below funtion.
 2. getRegistrationPage method accepts Model as argument.
**/

    @RequestMapping("/register")
    public String getRegistrationPage(Model model){
        //Todo:                     check
        Vehicle car = registration.getNewCar();
        model.addAttribute("car", car);
        return "carregister";
    }


  /*
   1. getResponsePage method uses registerCar() method to register the car submitted from carregsiter.jsp.
   2. It should return "success" if registerCar() return true else it should return "carregister".
   3. getResponsePage method uses @ModelAttribute annotation to bind data with reference to car domain.
  */
    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute(value = "car") Car car, Model model){
        // Car car is incoming data (object binding)
        // Model model is outgoing view (Response)
        //Write your logic here
        if (registration.registerCar(car.getRegisterationNumber(), car.getCarName(), car.getCarDetails(), car.getCarWork())) {
            model.addAttribute("msg", "Car Registered Successfully");
            return "done";
        }

        model.addAttribute("FailMessage", "Registration is failed, please try again!");
        return "carregister";
    }
}
