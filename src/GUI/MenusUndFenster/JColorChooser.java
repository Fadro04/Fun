package GUI.MenusUndFenster;

import java.awt.*;

public class JColorChooser {
    public static void main(String[] args) {
        Color ausgewaehlteFarbe = javax.swing.JColorChooser.showDialog(null,
                "Farbauswahl", null);
        System.out.println(ausgewaehlteFarbe);
    }

    private static Color showDialog(Object o, String farbauswahl, Object o1) {
        return Color.BLACK;
    }

}
