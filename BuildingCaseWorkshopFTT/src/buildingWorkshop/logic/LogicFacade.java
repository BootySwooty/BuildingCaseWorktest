package buildingWorkshop.logic;


import buildingWorkshop.acq.*;

/**
 * @author Frederik
 */

public class LogicFacade implements ILogicFacade
{
    ISystemWorld systemWorld= new SystemWorld();

    @Override
    public ISystemWorld getSystemWorld()
    {
        return systemWorld;
    }
}
