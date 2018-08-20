package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * <h1>SETTINGS CONTROLLER</h1>
 * Controller class for Settings.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class SettingsController {

    private Stage stagex = new Stage();
    @FXML private ChoiceBox soundchoice;

    @FXML public void initialize() {
        soundchoice.setValue(GameState.sval);
    }
    /**
     * Event Handler for Button to save sound choice and
     * go back to the home page.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void goBack(ActionEvent event) throws Exception {
        int op = soundchoice.getSelectionModel().getSelectedIndex();
        GameState.sval = (String) soundchoice.getSelectionModel().getSelectedItem();
        if(op==0)
            GameState.sfx = new AudioClip(PreferencesController.class.getResource("../resources/sound/beep.wav").toString());
        if(op==1)
            GameState.sfx = new AudioClip(PreferencesController.class.getResource("../resources/sound/click.wav").toString());
        if(op==2)
            GameState.sfx = new AudioClip(PreferencesController.class.getResource("../resources/sound/fastpop.wav").toString());
        if(op==3)
            GameState.sfx = new AudioClip(PreferencesController.class.getResource("../resources/sound/pop.wav").toString());
        if(op==4)
            GameState.sfx = new AudioClip(PreferencesController.class.getResource("../resources/sound/laser.wav").toString());
        if(op==5)
            GameState.sfx = new AudioClip(PreferencesController.class.getResource("../resources/sound/laser2.wav").toString());

        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/home.fxml")), 600, 900);
        GameState.mainStage.setScene(s);
    }

    /**
     * Opens new window to change color for Player 1.
     * @param event Click Triggered Event
     * @throws Exception Any ExceptionException
     */
    @FXML protected void changePS1(ActionEvent event) throws Exception {
        GameState.alterPlayer = 1;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 1");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 2.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS2(ActionEvent event) throws Exception {
        GameState.alterPlayer = 2;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 2");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 3.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS3(ActionEvent event) throws Exception {
        GameState.alterPlayer = 3;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 3");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 4.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS4(ActionEvent event) throws Exception {
        GameState.alterPlayer = 4;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 4");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 5.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS5(ActionEvent event) throws Exception {
        GameState.alterPlayer = 5;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 5");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 6.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS6(ActionEvent event) throws Exception {
        GameState.alterPlayer = 6;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 6");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 7.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS7(ActionEvent event) throws Exception {
        GameState.alterPlayer = 7;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 7");
        stagex.show();
    }

    /**
     * Opens new window to change color for Player 8.
     * @param event Click Triggered Event
     * @throws Exception Any Exception
     */
    @FXML protected void changePS8(ActionEvent event) throws Exception {
        GameState.alterPlayer = 8;
        Scene s = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/preferences.fxml")), 550, 250);
        stagex.setScene(s);
        stagex.setTitle("Customisation for Player 8");
        stagex.show();
    }
}
