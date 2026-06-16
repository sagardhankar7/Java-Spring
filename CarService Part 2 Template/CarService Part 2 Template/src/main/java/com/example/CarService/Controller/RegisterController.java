package com.example.CarService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

/**
 1. Modify the below funtion.
 2. getRegistrationPage method accepts Model as argument.
**/

    @RequestMapping("/register")
    public String getRegistrationPage(){
        return "carregister";
    }


  /*
   1. getResponsePage method uses registerCar() method to register the car submitted from carregsiter.jsp.
   2. It should return "success" if registerCar() return true else it should return "carregister".
   3. getResponsePage method uses @ModelAttribute annotation to bind data with reference to car domain.
  */
    @RequestMapping("/done")
    public String getResponsePage(){
        //Write your logic here
        return null;
    }
}
