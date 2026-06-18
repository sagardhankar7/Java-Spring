package com.example.CarService.web;

import com.example.CarService.domain.Car;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 1. getAttendent method returns string "attendent" for Attendent page.
 2. Also, it accepts attendentId of type String and object of type ModelMap as argument.
 3. Use @PathVariable annotation accordingly.
**/

@Controller
public class attendentController {
    
  @GetMapping("/attendent/{attendentId}")
    public String getAttendent(@PathVariable String attendentId, ModelMap uiModel){
      //Write your Logic here
      uiModel.addAttribute("name", "Test 123");
      uiModel.addAttribute("speciality", "Engine,BodyShop");
      return "attendent";
    }

//  @Autowired
//  Registration registration;
//
//  @GetMapping("/attendent/{attendentId}")
//  public String getAttendent(@PathVariable int attendentId,
//                             ModelMap model) {
//
////    Car car = registration.(attendentId);
//
////    model.addAttribute("name", car.getCarName());
////    model.addAttribute("speciality", car.getCarWork());
//
//    return "attendent";
//  }

}
