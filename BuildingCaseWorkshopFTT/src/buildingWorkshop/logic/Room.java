/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingWorkshop.logic;
import buildingWorkshop.acq.IRoom;

import java.util.ArrayList;

/**
 * @author Frederik
 */
public class Room implements IRoom
{
    private String name;
    private int numberOfSensors;
    private ArrayList<Sensor> sensorList;
    private Sensor sensor;


    public Room(String name, int numberOfSensors)
    {
        this.name = name;
        this.numberOfSensors = numberOfSensors;
        this.sensorList = new ArrayList<>();
    }

    public void addSensor(double minValue, double maxValue, String unit, String name)
    {
        for (int i = 0; i <= numberOfSensors; i++)
        {
            Sensor sensor = new Sensor(minValue, maxValue, unit, name);
            sensorList.add(sensor);
        }
    }
    
    public void removeSensor(int index)
    {
        sensorList.remove(index);
    }



    public ArrayList<Sensor> getSensorList()
    {
        return sensorList;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getNumberOfSensors()
    {
        return numberOfSensors;
    }

    public Sensor getSensor()
    {
        return sensor;
    }
}
