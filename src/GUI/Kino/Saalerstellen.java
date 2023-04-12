package GUI.Kino;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saalerstellen {
    private static int reih;
    static Icon kinoSitzIcon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Fun\\src\\GUI\\Kino\\Bilder\\KinoSitz.PNG");
    static Icon kinoSitzRotIcon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Fun\\src\\GUI\\Kino\\Bilder\\KinoSitzBesetzt.png");
    static Icon kinoSitzGruenIcon = new ImageIcon("C:\\Users\\User\\IdeaProjects\\Fun\\src\\GUI\\Kino\\Bilder\\KinoSitzGruen.png");
    static Border sitzBorder = new Border() {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    };

    static Boolean anlegenButtonClicked = false;



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        //Panels
        //North
        JPanel nortPanel = createNorthPanel();

        //West
        JPanel panelWest = new JPanel();
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
        //West 1
        //SaalDaten
        JPanel saalDatenPanel = createSaalDatenPanel();
        JButton quadratisch = (JButton) saalDatenPanel.getComponent(4);
        JButton variabelButton = (JButton) saalDatenPanel.getComponent(6);

        //West 2
        //QuadratischSaal
        JPanel quadratischSaalPanel = createQuadratischSaalPanel();

        //West3
        //VariabelSaal
        JPanel variableSaalPanel = createVariabelSaalPanel();
        JTextPane reihenAnzahl = (JTextPane) variableSaalPanel.getComponent(1);
        JButton reihenAnlegen = (JButton) variableSaalPanel.getComponent(2);

        //West 4
        //SaalReihen Panel
        JPanel saalReihenPanel = createSaalReihenPanel();
        JButton zurueckButton = new JButton();


        panelWest.add(saalDatenPanel);
        panelWest.add(quadratischSaalPanel);
        panelWest.add(variableSaalPanel);
        panelWest.add(saalReihenPanel);


        frame.add(nortPanel, BorderLayout.NORTH);
        frame.add(panelWest, BorderLayout.WEST);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

        //Action Listener
        quadratisch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variableSaalPanel.setVisible(false);
                quadratischSaalPanel.setVisible(true);
                frame.pack();
            }
        });

        variabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quadratischSaalPanel.setVisible(false);
                variableSaalPanel.setVisible(true);
                frame.pack();
            }
        });

        reihenAnlegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saalerstellen.setReih(Integer.parseInt(reihenAnzahl.getText()));
                saalReihenPanel.setLayout(new GridLayout(reih + 2, 2));

                if (anlegenButtonClicked) {
                    saalReihenPanel.removeAll();
                }

                JLabel sitze = new JLabel();
                sitze.setText("Anzahl der Sitze pro Reihe festlegen");
                saalReihenPanel.add(sitze);
                saalReihenPanel.add(new JLabel());
                for (int i = 0; i < reih; i++) {
                    JLabel reihe = new JLabel();
                    if (reih < 27) {
                        String[] reihenBezeichnung = createReihenBezeichnung(reih);
                        reihe.setText((i+1) + " . Reihe " + reihenBezeichnung[i] + ":");
                    } else {
                        reihe.setText((i+1) + " . Reihe:");
                    }
                    JTextField sitzeProReihe = new JTextField();
                    saalReihenPanel.add(reihe);
                    saalReihenPanel.add(sitzeProReihe);
                }
                zurueckButton.setText("zurück");
                saalReihenPanel.add(zurueckButton);
                anlegenButtonClicked = true;

                saalReihenPanel.setVisible(true);
                System.out.println(reih);
                frame.pack();
            }
        });

        zurueckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saalReihenPanel.setVisible(false);
                frame.pack();
            }
        });
    }


    public static void setReih(int reih) {
        Saalerstellen.reih = reih;
    }

    public static JPanel createNorthPanel() {
        //Panel North
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridLayout(1, 4));
        JLabel ueberschrift = new JLabel();
        ueberschrift.setText("Erstelle einen Saal");
        JLabel kinoSitz = new JLabel();
        JLabel kinoSitzRot = new JLabel();
        JLabel kinoSitzGruen = new JLabel();
        kinoSitz.setIcon(kinoSitzIcon);
        kinoSitzRot.setIcon(kinoSitzRotIcon);
        kinoSitzGruen.setIcon(kinoSitzGruenIcon);
        kinoSitz.setBorder(sitzBorder);
        kinoSitzRot.setBorder(sitzBorder);
        kinoSitzGruen.setBorder(sitzBorder);
        kinoSitz.setText("Freier Sitzplatz");
        kinoSitzRot.setText("Besetzter Sitzplatz");
        kinoSitzGruen.setText("Premium Sitz");

        panelNorth.add(ueberschrift);
        panelNorth.add(kinoSitz);
        panelNorth.add(kinoSitzRot);
        panelNorth.add(kinoSitzGruen);

        return panelNorth;
    }

    public static JPanel createSaalDatenPanel() {
        //Panel SaalDaten
        JPanel panelSaalDaten = new JPanel();
        panelSaalDaten.setLayout(new GridLayout(4, 2));
        JLabel saalDaten = new JLabel();
        saalDaten.setText("Saal Daten anlegen");
        JLabel saalNameLabel = new JLabel();
        saalNameLabel.setText("Saal Name:");
        JTextPane saalName = new JTextPane();

        JButton quadratisch = createRoundedButton();
        JButton variabel = createRoundedButton();
        quadratisch.setText("anlegen Reihe X Sitze");
        variabel.setText("Reihenanzahl einzelnd");
        JLabel quadratischInfo = new JLabel();
        JLabel variabelInfo = new JLabel();
        quadratischInfo.setText("Eine Reihe hat immer eine anzahl von sitzen");
        variabelInfo.setText("Variable sitz anzahl pro Reihe");

        panelSaalDaten.add(saalDaten);      //1
        panelSaalDaten.add(new JLabel());   //2
        panelSaalDaten.add(saalNameLabel);  //3
        panelSaalDaten.add(saalName);       //4
        panelSaalDaten.add(quadratisch);    //5
        panelSaalDaten.add(quadratischInfo);//6
        panelSaalDaten.add(variabel);       //7
        panelSaalDaten.add(variabelInfo);   //8

        return panelSaalDaten;
    }

    public static JPanel createQuadratischSaalPanel() {
        //Panel quadratischSaal
        JPanel quadratischSaal = new JPanel();
        quadratischSaal.setLayout(new GridLayout(2, 2));
        JLabel reihenLabel = new JLabel();
        JLabel sitzLabel = new JLabel();
        JTextPane reihen = new JTextPane();
        JTextPane sitze = new JTextPane();
        reihenLabel.setText("Anzahl Reihen:");
        sitzLabel.setText("Anzahl Sitze pro Reihe");

        quadratischSaal.add(reihenLabel);
        quadratischSaal.add(reihen);
        quadratischSaal.add(sitzLabel);
        quadratischSaal.add(sitze);

        quadratischSaal.setVisible(false);

        return quadratischSaal;
    }

    public static JPanel createVariabelSaalPanel() {
        JPanel variabelSaal = new JPanel();
        variabelSaal.setLayout(new GridLayout(2, 2));
        JLabel reihenAnzahlLabel = new JLabel();
        JTextPane reihenAnzahl = new JTextPane();
        reihenAnzahlLabel.setText("Anzahl der Reihen:");
        JButton reihenAnlegen = new JButton();
        reihenAnlegen.setText("Reihen anlegen");


        variabelSaal.add(reihenAnzahlLabel);    //0
        variabelSaal.add(reihenAnzahl);         //1
        variabelSaal.add(reihenAnlegen);        //2
        variabelSaal.add(new JLabel());         //3

        variabelSaal.setVisible(false);

        return variabelSaal;
    }

    public static JPanel createSaalReihenPanel() {
        JPanel saalReihen = new JPanel();
        saalReihen.setVisible(false);

        return saalReihen;
    }

    public static JButton createRoundedButton() {
        JButton addBtn = new JButton("+");
        addBtn.setBounds(new Rectangle(30, 25));
        addBtn.setBorder(new RoundedBorder(30)); //10 is the radius
        addBtn.setBackground(Color.WHITE);
        return addBtn;
    }


    public static String[] createReihenBezeichnung(int lenght) {
        String[] abc = new String[26];
        String[] reihenBezeichnung = new String[lenght];
        abc[0] = "A";
        abc[1] = "B";
        abc[2] = "C";
        abc[3] = "D";
        abc[4] = "E";
        abc[5] = "F";
        abc[6] = "G";
        abc[7] = "H";
        abc[8] = "I";
        abc[9] = "J";
        abc[10] = "K";
        abc[11] = "L";
        abc[12] = "M";
        abc[13] = "N";
        abc[14] = "O";
        abc[15] = "P";
        abc[16] = "Q";
        abc[17] = "R";
        abc[18] = "S";
        abc[19] = "T";
        abc[20] = "U";
        abc[21] = "V";
        abc[22] = "W";
        abc[23] = "X";
        abc[24] = "Y";
        abc[25] = "Z";


        int vielfach26;
        int vielfach26Rest;
        if (lenght <= 26) {
            for (int j = 0; j < lenght; j++) {
                reihenBezeichnung[j] = abc[j];
            }
            return reihenBezeichnung;
        } else {
            vielfach26 = lenght / 26;
            vielfach26Rest = lenght - (vielfach26 * 26);
            for (int i = 0; i < vielfach26; i++) {
                for (int j = 0; j < 26; j++) {

                }
            }

            return reihenBezeichnung;
        }
    }
}
