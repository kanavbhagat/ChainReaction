package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;


/**
 * <h1>HOME CONTROLLER</h1>
 * Controller class for Home Page for the Application.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class HomeController {

    @FXML private ChoiceBox playerChoice;

    /**
     * Event Handler for the button that triggers the smaller
     * version of the grid.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void playSD(ActionEvent event) throws Exception {
        int op = playerChoice.getSelectionModel().getSelectedIndex();
        GameState.numPlayers = op + 2;
        GameState.saveGame = 0;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/game1.fxml")), 600, 900);
        GameState.mainStage.setScene(s);
    }


    /**
     * Event Handler for the button that triggers the larger
     * version of the grid.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void playHD(ActionEvent event) throws Exception {
        int op = playerChoice.getSelectionModel().getSelectedIndex();
        GameState.numPlayers = op + 2;
        GameState.saveGame = 0;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/game2.fxml")), 600, 900);
        GameState.mainStage.setScene(s);
    }


    /**
     * Event Handler for the button that opens the settings page
     * for the application.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void openSettings(ActionEvent event) throws Exception {
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/settings.fxml")), 600, 900);
        GameState.mainStage.setScene(s);
    }


    /**
     * Event Handler for the button that triggers the last played game
     * along with the state of the grid.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void resume(ActionEvent event) throws Exception {
        if(GameState.isWon) {
            return;
        }
        SaveGame x = Main.load();
        for(int i = 0 ; i < 8 ; i++) {
            GameState.colorCodes[i] = Color.web(Integer.toHexString(x.colorCodes[i]));
        }
        GameState.numPlayers = x.numPlayers;
        GameState.grid = x.grid;
        GameState.count = x.count;
        GameState.saveGame = 1;
        if(x.grid[0][0].getRad() == 20) {
            Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/game1.fxml")), 600, 900);
            GameState.mainStage.setScene(s);
        }
        else {
            Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/game2.fxml")), 600, 900);
            GameState.mainStage.setScene(s);
        }
    }
}
