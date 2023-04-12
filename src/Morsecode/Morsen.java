package Morsecode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Morsen {
    private JRadioButton rd1;
    private JRadioButton rd2;
    private JTextPane tp1;
    private JTextPane tp2;
    private JPanel mainpanel;

    private String[] abc = new String[27];

    public Morsen() {
        rd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tp1.getText();
                //Hallo du da
                text.replace("A", "a");
                text.replace("B", "b");
                text.replace("C", "c");
                text.replace("D", "d");
                text.replace("E", "e");
                text.replace("F", "f");
                text.replace("G", "g");
                text.replace("H", "h");
                text.replace("I", "i");
                text.replace("J", "j");
                text.replace("K", "k");
                text.replace("L", "l");
                text.replace("M", "m");
                text.replace("N", "n");
                text.replace("O", "o");
                text.replace("P", "p");
                text.replace("Q", "q");
                text.replace("R", "r");
                text.replace("S", "s");
                text.replace("T", "t");
                text.replace("U", "u");
                text.replace("V", "v");
                text.replace("W", "w");
                text.replace("X", "x");
                text.replace("Y", "y");
                text.replace("Z", "z");

                text.replace("a", "._");
                text.replace("b", "_...");
                text.replace("c", "_._.");
                text.replace("d", "_..");
                text.replace("e", ".");
                text.replace("f", ".._.");
                text.replace("g", "_..");
                text.replace("h", "....");
                text.replace("i", "..");
                text.replace("j", ".___");
                text.replace("k", "_._");
                text.replace("l", "._..");
                text.replace("m", "__");
                text.replace("n", "_.");
                text.replace("o", "___");
                text.replace("p", ".__.");
                text.replace("q", "__._");
                text.replace("r", "._.");
                text.replace("s", "...");
                text.replace("t", "_");
                text.replace("u", ".._");
                text.replace("v", "..._");
                text.replace("w", ".__");
                text.replace("x", "_.._");
                text.replace("y", "_.__");
                text.replace("z", "__..");

                text.replace("1", ".____");
                text.replace("2", "..___");
                text.replace("3", "...__");
                text.replace("4", "...._");
                text.replace("5", ".....");
                text.replace("6", "_....");
                text.replace("7", "__...");
                text.replace("8", "___..");
                text.replace("9", "____.");
                text.replace("0", "_____");

                tp2.setText(text);
            }
        });
    }

    public JPanel getMainpanel() {
        return mainpanel;
    }
}
