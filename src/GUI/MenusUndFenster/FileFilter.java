package GUI.MenusUndFenster;

import javax.swing.*;
import java.io.File;

public class FileFilter extends javax.swing.filechooser.FileFilter {
    public static void main(String[] args) {
        // Erstellung unseres FileFilters für Bilddateien
        FileFilter filter = new FileFilter();
        JFileChooser chooser = new
                JFileChooser("c:/programmierung/beispieldateien");
        // Filter wird unserem JFileChooser hinzugefügt
        chooser.addChoosableFileFilter(filter);
        // Erzeugung eines neuen Frames mit dem Titel "Dateiauswahl"
        JFrame meinJFrame = new JFrame("Dateiauswahl");
        // Wir setzen die Breite auf 450 und die Höhe auf 300 Pixel
        meinJFrame.setSize(450,300);
        // Hole dir den ContentPane und füge diesem unseren JColorChooser hinzu
        meinJFrame.getContentPane().add(chooser);
        // Wir lassen unseren Frame anzeigen
        meinJFrame.setVisible(true);
    }

    @Override
    public boolean accept(File f) {
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }
}