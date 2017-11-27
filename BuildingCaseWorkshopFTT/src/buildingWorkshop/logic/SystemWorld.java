/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingWorkshop.logic;

import buildingWorkshop.acq.IBuilding;
import buildingWorkshop.acq.ISystemWorld;

import java.util.ArrayList;

/**
 * @author Frederik
 */
public class SystemWorld implements ISystemWorld
{
    private Location location;
    private ArrayList<Building> buildingList;

    public SystemWorld()
    {
        this.buildingList = new ArrayList<>();
    }

    public void removeBuilding(int index)
    {
        buildingList.remove(index);
    }

    @Override
    public void addBuilding(String address, String description, int numberOfRooms)
{
    Building building = new Building(address, description, location, numberOfRooms);
    buildingList.add(building);
    System.out.println(buildingList.size() + "size of buildinglist");
}
//    @Override
//    public ArrayList<IBuilding> getBuildingList()
//    {
//        return (IBuilding) buildingList;
//    }

    @Override
    public IBuilding getBuilding(int index)
    {
     return buildingList.get(index);
    }

}


