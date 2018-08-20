package game;

import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * <h1>GAMESTATE</h1>
 * Stores current game state to be accessed in all classes.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class GameState {
    protected static Stage mainStage;
    protected static int numPlayers;
    protected static int alterPlayer;
    protected static int saveGame;
    protected static boolean isWon = true;
    protected static AudioClip sfx = new AudioClip(GameState.class.getResource("../resources/sound/beep.wav").toString());
    protected static String sval = "Beep";
    protected static Color[] colorCodes = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.PURPLE, Color.CYAN, Color.ORANGE, Color.WHITE};
    protected static Cell[][] grid;
    protected static int count;
}
