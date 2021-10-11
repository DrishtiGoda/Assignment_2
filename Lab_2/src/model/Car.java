/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author dgoda
 */

//Find me the first available passenger car.
//How many cars are currently available. How many are not.
//List all cars that are made by Toyota, GM, etc.
//List all cars that were manufactured in a given year, ‘x’.
//List all cars with a minimum of x seats but no more than y seats.
//Find a car with the given serial number. List the attributes of the found car.
//List all cars given the model number.
//List all the car manufacturers used by the (this) Uber.
//When was the last time the fleet catalog was updated.
//List all cars that are available in a given city.
//List all cars that have expired maintenance certificate.

// private boolean available;
//    private String brand;
//    private int manufactured_year;
//    private int min_seats;
//    private int max_seats;
//    private int serial_num;
//    private String colour;
//    private String model_num;
//    private String availble_city;
//    private boolean maintenance_certificate;
//    private Date createdOn;

public class Car {
    
    private boolean available;
    private String brand;
    private int manufactured_year;
    private int min_seats;
    private int max_seats;
    private int serial_num;
    private String colour;
    private String model_num;
    private String available_city;
    private boolean maintainance_certificate;
    private Date createdOn;
    
    
       public Car(boolean available, String brand, int manufactured_year, int min_seats, int max_seats, int serial_num, String colour, String model_num, String availble_city, boolean maintenance_certificate) {
        this.available = available;
        this.brand = brand;
        this.manufactured_year = manufactured_year;
        this.min_seats = min_seats;
        this.max_seats = max_seats;
        this.serial_num = serial_num;
        this.colour = colour;
        this.model_num = model_num;
        this.available_city = availble_city;
        this.maintainance_certificate = maintenance_certificate;
        this.createdOn = new Date();
    }
       
       public Car(){}
    
    
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufactured_year() {
        return manufactured_year;
    }

    public void setManufactured_year(int manufactured_year) {
        this.manufactured_year = manufactured_year;
    }

    public int getMin_seats() {
        return min_seats;
    }

    public void setMin_seats(int min_seats) {
        this.min_seats = min_seats;
    }

    public int getMax_seats() {
        return max_seats;
    }

    public void setMax_seats(int max_seats) {
        this.max_seats = max_seats;
    }

    public int getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(int serial_num) {
        this.serial_num = serial_num;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel_num() {
        return model_num;
    }

    public void setModel_num(String model_num) {
        this.model_num = model_num;
    }

    public String getAvailable_city() {
        return available_city;
    }

    public void setAvailable_city(String available_city) {
        this.available_city = available_city;
    }

    public boolean isMaintainance_certificate() {
        return maintainance_certificate;
    }

    public void setMaintainance_certificate(boolean maintainance_certificate) {
        this.maintainance_certificate = maintainance_certificate;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    @Override
    public String toString() {
        return this.getBrand(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
