/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingWorkshop.logic;

import buildingWorkshop.acq.IBuilding;

import java.util.ArrayList;

/**
 * @author Frederik
 */
public class Building implements IBuilding
{
    private ArrayList<Room> roomList;
    private String name;
    private String description;
    private int numberOfRooms;
    private Location location;
    private Room room;

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public Location getLocation()
    {
        return location;
    }

    public Room getRoom()
    {
        return room;
    }

    public Building( String name,String description, Location location, int numberOfRooms)
    {
        this.name = name;
        this.description=description;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.roomList = new ArrayList<>();
    }

    public void addRoom(String name, int numberOfSensors)
    {
        for (int i = 0; i <= numberOfRooms; i++)
        {
            room = new Room(name, numberOfSensors);
            roomList.add(room);
        }

    }
    
    public void removeRoom (int index)
    {
        roomList.remove(index);
    }

    public ArrayList<Room> getRoomList()
    {
        return roomList;
    }


}
