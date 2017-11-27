/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingWorkshop.acq;

/**
 * @author Frederik
 */
public interface IRoom
{
    void addSensor(double minValue, double maxValue, String unit, String name);

    String getName();

    int getNumberOfSensors();
}
