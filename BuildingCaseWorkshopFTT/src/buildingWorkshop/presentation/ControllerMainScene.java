package buildingWorkshop.presentation;

import buildingWorkshop.acq.ILogicFacade;
import buildingWorkshop.acq.ISystemWorld;
import buildingWorkshop.acq.IUserInterface;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;



/**
 * @author Frederik
 */

public class ControllerMainScene implements IUserInterface
{
    ILogicFacade logic;


    @FXML
    public void handleExit(ActionEvent event)
    {
        Platform.exit();
    }

    @FXML
    public void handleAddBuilding(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AddBuilding.fxml"));

        GridPane gridPane = loader.load();
        IUserInterface controller = loader.getController();
        controller.injectLogic(logic);

        Scene scene2 = new Scene(gridPane);
        //Get Stage information

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    public void handleShowHistory(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowHistory.fxml"));
        GridPane gridPane = loader.load();
        ControllerShowHistory controllerShowHistory = loader.getController();
        Scene scene2 = new Scene(gridPane);
        //Get Stage information

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @Override
    public void injectLogic(ILogicFacade logicLayer)
    {
        logic = logicLayer;
    }

}
