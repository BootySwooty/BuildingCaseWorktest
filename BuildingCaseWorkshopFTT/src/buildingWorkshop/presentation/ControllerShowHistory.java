package buildingWorkshop.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * @author Frederik
 */

public class ControllerShowHistory
{
    public ComboBox chooseSensor3;
    public ComboBox chooseSensor2;
    public ComboBox chooseSensor1;
    public TextArea textArea1;

    @FXML
    public void handleBack(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene1 = new Scene(root);
        window.setScene(scene1);
        window.show();
    }


}
