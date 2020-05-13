/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.text.SimpleDateFormat;
import project2.Vehicle;
import java.util.Random;
/**
 *
 * @author Shmuel Weinfeld
 */
public class Car extends Vehicle implements ClimateControl{
    //instance variables
    protected String vin; 
    private int numberOfPassengers;
    //Constructor methods
    public Car(int numberOfWheels){
        super(numberOfWheels);
        this.vin = "Car- "+ getVehicleCounter();
    }
    public Car(int numberOfWheels, int numberOfPassengers){
        super(numberOfWheels);
        this.numberOfPassengers = numberOfPassengers; 
        this.vin = "Car- "+ getVehicleCounter();
    }
    public String getVin(){
       
        return vin;
    }

    public int getNumberOfPassengers()
    {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers)
    {
        this.numberOfPassengers = numberOfPassengers;
    }
    //implementing interface method
    public void currentTemperature(){
        Random rndGen = new Random();
        int currentTemp = rndGen.nextInt(68)+32;
        System.out.println("Car current temperature is: "+currentTemp);
        
    }
    //implementing abstract methods
    
    public void move(){
        System.out.println("Car is moving");
    }
    
   
    public void stop(){
        System.out.println("Car is stopped");
    }
    //implementing abstact method specs
    public void specs(){
        System.out.println("======================================");
        System.out.println("Car");
        System.out.println("======================================");
                
        String pattern = "dd-MM-yyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(dateBuild);
        System.out.println("Vin:\t\t\t\t"+vin);
        System.out.println("dateBuild:\t\t\t"+date);
        System.out.println("numberOfWheels:\t\t\t"+numberOfWheels);
        System.out.println("weight:\t\t\t\t"+weight);
        
    }
    //implementing interface methods
    public void cool(){
        System.out.println("Car is cooling");
    }
    public void heat(){
        System.out.println("Car is heating");
    }
    
    
}
