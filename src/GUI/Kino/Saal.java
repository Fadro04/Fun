package GUI.Kino;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saal extends JFrame {
    public static void main(String[] args) {
        int x = 10;
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        JPanel reihen = new JPanel();
        reihen.setLayout(new GridLayout(x+1, 1));
        Icon sitzIcon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Fun\\src\\GUI\\Kino\\Bilder\\KinoSitz.PNG");
        Icon sitzBesetztIcon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Fun\\src\\GUI\\Kino\\Bilder\\KinoSitzBesetzt.PNG");
        Icon sitzGruen = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Fun\\src\\GUI\\Kino\\Bilder\\KinoSitzGruen.PNG");

        JPanel rand2 = new JPanel();
        rand2.setLayout(new GridLayout(1, x+1));
        String[] t = getArray(x);
        for (int i = 0; i < x+1; i++) {
            JLabel ra = new JLabel();
            if (!(i == 0)) {
                ra.setText(t[i-1]);
            }
            rand2.add(ra);
        }
        reihen.add(rand2);
        for (int i = 0; i < x; i++) {
            JLabel rand = new JLabel();
            rand.setText("" + (i + 1));

            JPanel sitze = new JPanel();
            sitze.setLayout(new GridLayout(1, x+1));
            sitze.add(rand);
            for (int j = 0; j < x; j++) {
                JButton button = new JButton();
                button.setIcon(sitzIcon);
                button.setBorder(new Border() {
                    @Override
                    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    }

                    @Override
                    public Insets getBorderInsets(Component c) {
                        return new Insets(0,0,0,0);
                    }

                    @Override
                    public boolean isBorderOpaque() {
                        return false;
                    }
                });
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (button.getIcon().equals(sitzIcon)) {
                            button.setIcon(sitzBesetztIcon);
                        } else if (button.getIcon().equals(sitzBesetztIcon)) {
                            button.setIcon(sitzGruen);
                        } else if (button.getIcon().equals(sitzGruen)) {
                            button.setIcon(sitzIcon);
                        }
                    }
                });
                sitze.add(button);
            }
            reihen.add(sitze);
        }

        frame.add(reihen, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static String[] getArray(int lenght) {
        String[] array = new String[26];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        array[3] = "D";
        array[4] = "E";
        array[5] = "F";
        array[6] = "G";
        array[7] = "H";
        array[8] = "I";
        array[9] = "J";
        array[10] = "K";
        array[11] = "L";
        array[12] = "M";
        array[13] = "N";
        array[14] = "O";
        array[15] = "P";
        array[16] = "Q";
        array[17] = "R";
        array[18] = "S";
        array[19] = "T";
        array[20] = "U";
        array[21] = "V";
        array[22] = "W";
        array[23] = "X";
        array[24] = "Y";
        array[25] = "Z";

        String[] ar = new String[lenght];
        for (int i = 0;i < lenght;i++) {
            if (i >= 26) {
                ar[i] = ar[i-26] + array[i-26];
            } else {
                ar[i] = array[i];
            }
        }
        return ar;
    }
}