package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * <h1>WINNER CONTROLLER</h1>
 * Controller class to display winner of the game.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class WinnerController {

    @FXML Button okayButton;

    /**
     * Event handler for the Okay Button to remove the Window.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void okayCol(ActionEvent event) throws Exception {
        Stage stage = (Stage) okayButton.getScene().getWindow();
        stage.close();
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/home.fxml")), 600, 900);
        GameState.mainStage.setScene(s);
    }
}
