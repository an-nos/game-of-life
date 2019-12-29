package Game;
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.*;
import java.util.Arrays;

public class Simulation {


    public static void main(String[] args) throws InterruptedException {
//        UIManager.put( "control", new Color( 128, 128, 128) );
//        UIManager.put( "info", new Color(128,128,128) );
//        UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
//        UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
//        UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
//        UIManager.put( "nimbusFocus", new Color(115,164,209) );
//        UIManager.put( "nimbusGreen", new Color(176,179,50) );
//        UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
//        UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
//        UIManager.put( "nimbusOrange", new Color(191,98,4) );
//        UIManager.put( "nimbusRed", new Color(169,46,34) );
//        UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
//        UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
//        UIManager.put( "text", new Color( 230, 230, 230) );

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        Board board = new Board();

        new GameFrame(board);

    }

    //TODO: coloring?
    //TODO: traces?

}
