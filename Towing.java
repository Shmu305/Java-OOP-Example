/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Shmuel Weinfeld
 */
public interface Towing
{
    public void towing(Vehicle vehicleBeingTowed);
    public void towCapacity();
    public boolean canTow(Vehicle vehicle);
}
