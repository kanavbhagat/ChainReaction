package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.*;

/**
 * <h1>MAIN CLASS !!</h1>
 * Main Class from where everything begins.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class Main extends Application {
    /**
     * START METHOD FOR JAVAFX. Sets scenes for Home Page
     * and Stages accordingly.
     * @param primaryStage Stage for Application
     * @throws Exception Any Exception
     */
    @Override public void start(Stage primaryStage) throws Exception {
        Scene home = new Scene(FXMLLoader.load(getClass().getResource("../resources/fxml/home.fxml")), 600, 900);
        primaryStage.setTitle("Chain Reaction");
        primaryStage.setScene(home);
        GameState.mainStage = primaryStage;
        GameState.mainStage.show();
    }

    /**
     * Main Method for MAIN Class.
     * @param args Command Line Arguments (if any)
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Boilerplate Code for Serialize.
     * @param s1 SaveGame State to be Serialized
     * @throws IOException Input Output Exception
     */
    public static void save(SaveGame s1) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/resources/save/savegame"));
        out.writeObject(s1);
        out.close();
    }

    /**
     * Boilerplate Code for Deserialize.
     * @return SaveGame State
     * @throws IOException Input Output Exception
     * @throws ClassNotFoundException Class Not Found Exception
     */
    public static SaveGame load() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/resources/save/savegame"));
        SaveGame s1 = (SaveGame) in.readObject();
        in.close();
        return s1;
    }
}
