package buildingWorkshop.acq;

import java.util.ArrayList;

public interface ISystemWorld
{
    void addBuilding(String address, String description, int numberOfRooms);

    IBuilding getBuilding(int index);

//    ArrayList<IBuilding> getBuildingList();
}
