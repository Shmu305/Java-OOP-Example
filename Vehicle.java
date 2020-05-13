/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author Shmuel Weinfeld
 */
public abstract class Vehicle{
//class variable
    private static int vehicleCounter = 1000;
//instance variables/
    private String serialNumber;
    protected Date dateBuild;
    protected int numberOfWheels; 
    protected int weight; 
    
//constructor methods
    public Vehicle(){
        vehicleCounter++;
        this.serialNumber = "Vehicle - " + vehicleCounter;
        this.dateBuild = new Date();
        this.numberOfWheels = 0;
        this.weight = 0; 
    }
    public Vehicle(int numberOfWheels){
        this();
        Random rndGen = new Random();
        this.numberOfWheels = numberOfWheels;
        this.weight = rndGen.nextInt(2000)+2500;
    }

    public static int getVehicleCounter()
    {
        return vehicleCounter;
    }

    public static void setVehicleCounter(int vehicleCounter)
    {
        Vehicle.vehicleCounter = vehicleCounter;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    //abstract methods
    public abstract void specs();
    
    public abstract void move();
    
    public abstract void stop();
    
}//end class
