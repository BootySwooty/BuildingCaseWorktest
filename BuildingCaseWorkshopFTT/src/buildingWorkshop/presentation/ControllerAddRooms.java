package buildingWorkshop.presentation;

import buildingWorkshop.acq.ILogicFacade;
import buildingWorkshop.acq.IUserInterface;
import buildingWorkshop.logic.SystemWorld;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAddRooms implements ILogicFacade, IUserInterface
{

    public ComboBox chooseSensor3;
    public ComboBox chooseSensor2;
    public ComboBox chooseSensor1;

//    private String sensor1;
//    private String sensor2;
//    private String sensor3;
    private String roomName;
    @FXML
    TextField intNumberOfSensors;

    ILogicFacade logic;

//    @FXML
//    public void handleChooseSensor3(ActionEvent event)
//    {
//        if (chooseSensor3.getSelectionModel().getSelectedIndex() == 0)
//        {
//            sensor3 = "Sensor 3 -> No sensor";
//
//        }
//        else if (chooseSensor3.getSelectionModel().getSelectedIndex() == 1)
//        {
//            sensor3 = "Sensor 3 -> Temp. sensor ";
//        }
//        else if (chooseSensor3.getSelectionModel().getSelectedIndex() == 2)
//        {
//            sensor3 = "Sensor 3 -> Co2 sensor";
//        }
//    }
//
//    @FXML
//    public void handleChooseSensor2(ActionEvent event)
//    {
//        if (chooseSensor2.getSelectionModel().getSelectedIndex() == 0)
//        {
//            sensor2 = "Sensor 2 -> No sensor";
//        }
//        else if (chooseSensor2.getSelectionModel().getSelectedIndex() == 1)
//        {
//            sensor2 = "Sensor 2 -> Temp. sensor ";
//        }
//        else if (chooseSensor2.getSelectionModel().getSelectedIndex() == 2)
//        {
//            sensor2 = "Sensor 2 -> Co2 sensor";
//        }
//    }
//
//    @FXML
//    public void handleChooseSensor1(ActionEvent event)
//    {
//        if (chooseSensor1.getSelectionModel().getSelectedIndex() == 0)
//        {
//            sensor1 = "Sensor 1 -> No sensor";
//        }
//        else if (chooseSensor1.getSelectionModel().getSelectedIndex() == 1)
//        {
//            sensor1 = "Sensor 1 -> Temp. sensor ";
//        }
//        else if (chooseSensor1.getSelectionModel().getSelectedIndex() == 2)
//        {
//            sensor1 = "Sensor 1 -> Co2 sensor";
//        }
//
//    }

    @FXML
    public void handleSensors(ActionEvent event)
    {

    }

    @FXML
    public void handleAddRooms(ActionEvent event)
    {
        logic.getSystemWorld().getBuilding(0).addRoom(roomName, (Integer.parseInt(intNumberOfSensors.getText())));
    }

    @FXML
    public void handleBack(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AddBuilding.fxml"));
        GridPane gridPane = loader.load();

        ControllerAddBuilding controllerAddBuilding = loader.getController();
        Scene scene2 = new Scene(gridPane);
        //Get Stage information

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @Override
    public SystemWorld getSystemWorld()
    {
        return null;
    }

    @Override
    public void injectLogic(ILogicFacade logicLayer)
    {

    }
}
