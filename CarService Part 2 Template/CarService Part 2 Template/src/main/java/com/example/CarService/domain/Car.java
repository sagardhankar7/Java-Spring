package com.example.CarService.domain;

import com.example.CarService.repository.CarDAO;
import com.example.CarService.repository.DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 1. Autowire dao and use the save method in saveVehicleDetails() function.
**/

@Component
public class Car implements Vehicle{

    @Autowired
    DAO<Car> carDAO;

    // Kindly don't change the name of any variable & method as it will affect the test cases:

    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;



//    public Car(CarDAO carDAO) {
//        this.carDAO = carDAO;
//    }



    public Integer getCarId() {
        return CarId;
    }

    public void setCarId(Integer carId) {
        CarId = carId;
    }

    public String getRegisterationNumber() {
        return RegisterationNumber;
    }

    public void setRegisterationNumber(String registerationNumber) {
        RegisterationNumber = registerationNumber;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarDetails() {
        return CarDetails;
    }

    public void setCarDetails(String carDetails) {
        CarDetails = carDetails;
    }

    public String getCarWork() {
        return CarWork;
    }

    public void setCarWork(String carWork) {
        CarWork = carWork;
    }

    @Override
    public Boolean saveVehicleDetails() {
        if (RegisterationNumber!="" && this.RegisterationNumber!=null && this.CarName!=null && this.CarDetails!=null && this.CarWork != null) {
            carDAO.save(this);
            System.out.println("saved");
            return true;
        }
        return false;
    }

    @Override
    public void createVehicle(String RegistrationNumber, String CarName,String CarDetails,String CarWork ) {
        this.setRegisterationNumber(RegistrationNumber);
        this.setCarName(CarName);
        this.setCarDetails(CarDetails);
        this.setCarWork(CarWork);

    }

}


