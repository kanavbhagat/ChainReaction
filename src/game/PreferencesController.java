package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * <h1>PREFERNCES CONTROLLER</h1>
 * Controller class for preferences
 * with colors for all.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class PreferencesController {

    @FXML private ColorPicker colorPicker;

    @FXML public void initialize() {
        colorPicker.setValue(GameState.colorCodes[GameState.alterPlayer-1]);
    }
    /**
     * Event Handler for Okay button, which saves the
     * color for each player in the Game State.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void okayCol(ActionEvent event) throws Exception {
        Color c = colorPicker.getValue();
        GameState.colorCodes[GameState.alterPlayer-1] = c;
        Stage stage = (Stage) colorPicker.getScene().getWindow();
        stage.close();
    }

    /**
     * Event Handler for Cancel Button. Ignores all changes
     * and leaves the game state as it is.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void cancelCol(ActionEvent event) throws Exception {
        Stage stage = (Stage) colorPicker.getScene().getWindow();
        stage.close();
    }
}
