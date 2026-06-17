package com.example.CarService.service;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**

 1. Implement the interface Registration and Override the method registerCar() and getNewCar() in CarRegistrationService.
 2. Also,autowire car of type Vehicle and use it in method registerCar() and getNewCar().

**/

@Service
public class CarRegistrationService implements Registration {

    @Autowired
    Vehicle car;

    @Override
    public Boolean registerCar(String vehicleNo, String vehicleName, String CarDetails, String CarWork) {
//        car.setRegisterationNumber(vehicleNo);
//        car.setCarName(vehicleName);
//        car.setCarDetails(CarDetails);
//        car.setCarWork(CarWork);
        //Fix: DAO (only used through Domain)

//        return true;
        car.createVehicle(vehicleNo, vehicleName, CarDetails, CarWork);
        return car.saveVehicleDetails();
    }

    @Override
    public Vehicle getNewCar() {
        //Todo:
        return car;
    }
}
