/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.util.Random;
import java.text.SimpleDateFormat;
/**
 *
 * @author Shmuel Weinfeld
 */
public class Truck extends Vehicle implements Towing, ClimateControl{
    
    protected String vin;
    
    public Truck(int numberOfWheels){
    
        super(numberOfWheels);
        this.vin = "Truck- " + getVehicleCounter();
    }
    public String getVin(){
        
        return vin; 
        
    }
    @Override 
    public void specs(){
       System.out.println("======================================");
       System.out.println("Truck");
       System.out.println("======================================");
       String pattern = "dd-MM-yyyy HH:mm:ss" ;
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
       String date = simpleDateFormat.format(dateBuild);
       System.out.println("Vin:\t\t\t\t"+vin);
       System.out.println("dateBuild:\t\t\t"+ date);
       System.out.println("numberOfWheels:\t\t\t"+numberOfWheels);
       System.out.println("weight:\t\t\t\t"+weight);
       towCapacity();
    }
    //implementing abstract methods
    public void cool(){
        System.out.println("Truck is cooling");
    }
    public void heat(){
        System.out.println("Truck is heating");
    }
    //implemeting interface methods
    public void currentTemperature(){
        Random rndGen = new Random();
        int currentTemp = rndGen.nextInt(68)+32;
        System.out.println("Truck current temperature is: "+currentTemp);
        
    }
    
    public void towing(Vehicle vehicleBeingTowed){
        if(canTow(vehicleBeingTowed)){
            System.out.println("Truck can tow this vehicle");
        }
        else{
            System.out.println("Truck can not tow the vehicle");
        }
    }
    
    public void towCapacity(){
        System.out.println("Tow capacity:\t\t\t" +(0.9*getWeight()));
    }
    
    public boolean canTow(Vehicle vehicle){
       if(vehicle.getWeight() < (0.9*getWeight())){
           return true;
       }
       else{
           return false;
       }
    }
    //implementing abstract methods
    public void move(){
        System.out.println("Truck is moving");
    }
    public void stop(){
        System.out.println("Truck is stopped");
    }
}    