package game;

import javafx.scene.paint.Color;
import java.io.Serializable;

/**
 * <h1>SAVEGAME CLASS</h1>
 * Class with static fields to save state using
 * serialization.
 * @author Shwetank Shrey and Kanav Bhagat
 * @version 0.2
 * @since November 2017
 */
public class SaveGame implements Serializable {
    int numPlayers;
    int[] colorCodes;
    Cell[][] grid;
    int count;
}

