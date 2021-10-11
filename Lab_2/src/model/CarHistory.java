/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dgoda
 */
public class CarHistory {
    
//    ArrayList is an object and with all object we need to initialize it before we start using it.
//    so this way we tell java to allocate memory for ArrayList -- so to do this we will use constructor
    
//    constructor is just a method that has same name as class name 
    
    private ArrayList<Car> carList;
    
    public CarHistory(){
        this.carList = new ArrayList<Car>();      // here we allocated memory for array
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1, "Black", "Red One", "Boston", true);
        Car car2 = new Car(false, "BMW", 2019, 1, 4, 2, "Red", "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "Black", "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "Blue", "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "Green", "T2", "Chicago", false);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "Black", "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "Red", "F1", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "Blue", "X2", "Seattle", true);
        Car car9 = new Car(false, "Toyota", 2019, 1, 4, 9, "Green", "T3", "Austin", false);
        Car car10 = new Car(false, "GM", 2019, 1, 4, 10, "Black", "G3", "Austin", false);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
    }

    public ArrayList<Car> getCarList() {            // getter
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {         // setter
        this.carList = carList;
    }

    public void addCar(Car car)
    {
        carList.add(car);
    }
    
    public void deleteCar(Car product){
        carList.remove(product);
    }
    
     //1. Find me the first available passenger car.
    public Car firstAvailable()
    {
        return carList.get(0);
    }
    
    
    //2. How many cars are currently available. How many are not
    public int availableCar()
    {
        int available = 0;
        
        for(Car car : carList)
        {
            if(car.isAvailable())
            {
                available = available + 1;
            }
        }
        return available;
    }
    
        //3. List all cars that are made by Toyota, GM, etc.
    public ArrayList<Car> searchByBrand(String brand)
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if(car.getBrand().equalsIgnoreCase(brand)){
                list.add(car);
            }
        }
        return list;
    }
    
     //4. List all cars that were manufactured in a given year, ‘x’
    public ArrayList<Car> searchByYear(int manufactured_year)
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if(car.getManufactured_year() == manufactured_year){
                list.add(car);
            }
        }
        return list;
    }
    
    //5. Find an available car with a minimum of x seats but no more than y seats.
    public ArrayList<Car> searchBySeats(int min_seats, int max_seats)
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if(car.getMin_seats() >= min_seats && car.getMax_seats() <= max_seats){
                list.add(car);
            }
        }
        return list;
    }
    
    //6. Find a car with the given serial number. List the attributes of the found car
    public ArrayList<Car> searchBySerialNumber(int serial_num)
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if(car.getSerial_num() == serial_num){
                list.add(car);
            }
        }
        return list;
    }
    
    //7. List all cars given the model number
    public ArrayList<Car> searchByModelNumber(String model_num)
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if(car.getModel_num().equalsIgnoreCase(model_num)){
                list.add(car);
            }
        }
        return list;
    }
    
    //8. List all the car manufacturers used by the (this) Uber.
    public String carManufactures()
    {
        String manufacturers = "";
        for(Car car : carList){
            manufacturers = manufacturers + car.getBrand() +"\n";
        }
        return manufacturers;
    }
    
    //9. When was the last time the fleet catalog was updated.
    public Date lastUpdated()
    {
        Date min = carList.get(0).getCreatedOn();
        for(Car car : carList){
            if(car.getCreatedOn().compareTo(min) > 0){
                min = car.getCreatedOn();
            }
        }
        return min;
    }
    
    //10. List all cars that are available in a given city.
    public ArrayList<Car> searchByAvailableInCity(String available_city)
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if((car.getAvailable_city().equalsIgnoreCase(available_city)) && (car.isAvailable())){
                list.add(car);
            }
        }
        return list;
    }
    
    //11. List all cars that have expired maintenance certificate
    public ArrayList<Car> searchByMaintenanceCertificate()
    {
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : carList){
            if(car.isMaintainance_certificate()== false){
                list.add(car);
            }
        }
        return list;
    }
    
    //12. List cars from a brand with this colour
    public ArrayList<Car> searchByBrandColour(String brand, String colour)
    {
        ArrayList<Car> temp = new ArrayList<Car>();
        temp = searchByBrand(brand);
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : temp){
            if(car.getColour().equalsIgnoreCase(colour)){
                list.add(car);
            }
        }
        return list;
    }
    
    //13. List brand cars available in a city
    public ArrayList<Car> searchByAvailableBrand(String city, String brand)
    {
        ArrayList<Car> temp = new ArrayList<Car>();
        temp = searchByAvailableInCity(city);
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : temp){
            if(car.getBrand().equalsIgnoreCase(brand)){
                list.add(car);
            }
        }
        return list;
    }
    
    //14. List brand cars with particular seats
    public ArrayList<Car> searchByBrandSeats(String brand, int seats)
    {
        ArrayList<Car> temp = new ArrayList<Car>();
        temp = searchByBrand(brand);
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : temp){
            if(car.getMax_seats() == seats){
                list.add(car);
            }
        }
        return list;
    }
    
    //15. Search Cars with Model number x and Serial number y
    public ArrayList<Car> searchByModelSerial(int serialNumber, String modelNumber)
    {
        ArrayList<Car> temp = new ArrayList<Car>();
        temp = searchBySerialNumber(serialNumber);
        ArrayList<Car> list = new ArrayList<Car>();
        for(Car car : temp){
            if(car.getModel_num().equalsIgnoreCase(modelNumber)){
                list.add(car);
            }
        }
        return list;
    }
    
    
    
}
