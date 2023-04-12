package Morsecode;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        Morsen mb = new Morsen();
        setContentPane(mb.getMainpanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Morsecode");
        pack();
        setVisible(true);
    }
}
