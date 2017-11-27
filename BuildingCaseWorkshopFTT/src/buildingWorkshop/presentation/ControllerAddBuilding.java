package buildingWorkshop.presentation;

import buildingWorkshop.acq.IUserInterface;
import buildingWorkshop.logic.SystemWorld;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;

import buildingWorkshop.acq.ILogicFacade;

/**
 * @author Frederik
 */

public class ControllerAddBuilding implements ILogicFacade,IUserInterface
{
    public TextField address;
    public TextField description;
    @FXML
    TextField intNumberOfRooms;

    String addressString;
    String descriptionString;

    ILogicFacade logic;

    @FXML
    public void handleAddress(ActionEvent event)
    {
        addressString=address.getText();
    }

    @FXML
    public void handleDescription(ActionEvent event)
    {
        descriptionString=description.getText();
    }

    @FXML
    public void handleRooms(ActionEvent actionEvent)
    {

    }


    @FXML
    public void handleGoRoom(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("AddRooms.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root);
        window.setScene(scene1);
        window.show();
    }

    @FXML
    public void handleBack(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root);
        window.setScene(scene1);
        window.show();
    }

    @FXML
    public void handleAddBuilding(ActionEvent event)
    {
        logic.getSystemWorld().addBuilding(addressString, descriptionString, (Integer.parseInt(intNumberOfRooms.getText())));
        System.out.println("building added from ControllerAddBuilding and size is: " + logic.getSystemWorld().getBuilding(0));
        System.out.println("Buildinglist index 0 " + logic.getSystemWorld().getBuilding(0).getName() + logic.getSystemWorld().getBuilding(0).getDescription() + logic.getSystemWorld().getBuilding(0).getNumberOfRooms());
    }


    @Override
    public void injectLogic(ILogicFacade logicLayer)
    {
        logic = logicLayer;
    }

    @Override
    public SystemWorld getSystemWorld()
    {
        return null;
    }


}
