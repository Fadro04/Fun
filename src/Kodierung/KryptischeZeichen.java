package Kodierung;

import java.util.HashMap;

public class KryptischeZeichen {
    public static void main(String[] args) {
        HashMap<Integer, String> buchstaben = new HashMap<>();
        for (int i = 1; i <= (1*2*9*24); i++) {
            buchstaben.put(1, "E");

            int rest = i % 2;
            if (rest == 0) {
                buchstaben.put(2, "N");
                buchstaben.put(3, "I");
            } else {
                buchstaben.put(2, "I");
                buchstaben.put(3, "N");
            }

            rest = i % 6;
            if (rest == 1) {
                buchstaben.put(4, "R");
                buchstaben.put(5, "S");
                buchstaben.put(6, "A");
            } else if (rest == 2) {
                buchstaben.put(4, "A");
                buchstaben.put(5, "R");
                buchstaben.put(6, "S");
            } else if (rest == 3) {
                buchstaben.put(4, "S");
                buchstaben.put(5, "A");
                buchstaben.put(6, "R");
            } else if (rest == 4) {
                buchstaben.put(4, "R");
                buchstaben.put(5, "A");
                buchstaben.put(6, "S");
            } else if (rest == 5) {
                buchstaben.put(4, "A");
                buchstaben.put(5, "S");
                buchstaben.put(6, "R");
            } else {
                buchstaben.put(4, "S");
                buchstaben.put(5, "R");
                buchstaben.put(6, "A");
            }

            rest = i % 24;
            if (rest == 1) {
                buchstaben.put(7, "T");
                buchstaben.put(8, "D");
                buchstaben.put(9, "H");
                buchstaben.put(10, "U");
            } else if (rest == 2) {
                buchstaben.put(7, "T");
                buchstaben.put(8, "D");
                buchstaben.put(9, "U");
                buchstaben.put(10, "H");
            } else if (rest == 3) {
                buchstaben.put(7, "T");
                buchstaben.put(8, "H");
                buchstaben.put(9, "D");
                buchstaben.put(10, "U");
            } else if (rest == 4) {
                buchstaben.put(7, "T");
                buchstaben.put(8, "H");
                buchstaben.put(9, "U");
                buchstaben.put(10, "D");
            } else if (rest == 5) {
                buchstaben.put(7, "T");
                buchstaben.put(8, "U");
                buchstaben.put(9, "D");
                buchstaben.put(10, "H");
            } else if (rest == 6) {
                buchstaben.put(7, "T");
                buchstaben.put(8, "U");
                buchstaben.put(9, "H");
                buchstaben.put(10, "D");
            } else if (rest == 7) {
                buchstaben.put(7, "D");
                buchstaben.put(8, "T");
                buchstaben.put(9, "H");
                buchstaben.put(10, "U");
            } else if (rest == 8) {
                buchstaben.put(7, "D");
                buchstaben.put(8, "T");
                buchstaben.put(9, "U");
                buchstaben.put(10, "H");
            } else if (rest == 9) {
                buchstaben.put(7, "D");
                buchstaben.put(8, "H");
                buchstaben.put(9, "T");
                buchstaben.put(10, "U");
            } else if (rest == 10) {
                buchstaben.put(7, "D");
                buchstaben.put(8, "H");
                buchstaben.put(9, "U");
                buchstaben.put(10, "T");
            } else if (rest == 11) {
                buchstaben.put(7, "D");
                buchstaben.put(8, "U");
                buchstaben.put(9, "H");
                buchstaben.put(10, "T");
            } else if (rest == 12) {
                buchstaben.put(7, "D");
                buchstaben.put(8, "U");
                buchstaben.put(9, "T");
                buchstaben.put(10, "H");
            } else if (rest == 13) {
                buchstaben.put(7, "H");
                buchstaben.put(8, "U");
                buchstaben.put(9, "T");
                buchstaben.put(10, "D");
            } else if (rest == 14) {
                buchstaben.put(7, "H");
                buchstaben.put(8, "U");
                buchstaben.put(9, "D");
                buchstaben.put(10, "T");
            } else if (rest == 15) {
                buchstaben.put(7, "H");
                buchstaben.put(8, "T");
                buchstaben.put(9, "U");
                buchstaben.put(10, "D");
            } else if (rest == 16) {
                buchstaben.put(7, "H");
                buchstaben.put(8, "T");
                buchstaben.put(9, "D");
                buchstaben.put(10, "U");
            } else if (rest == 17) {
                buchstaben.put(7, "H");
                buchstaben.put(8, "D");
                buchstaben.put(9, "U");
                buchstaben.put(10, "T");
            } else if (rest == 18) {
                buchstaben.put(7, "H");
                buchstaben.put(8, "D");
                buchstaben.put(9, "T");
                buchstaben.put(10, "U");
            } else if (rest == 19) {
                buchstaben.put(7, "U");
                buchstaben.put(8, "T");
                buchstaben.put(9, "H");
                buchstaben.put(10, "D");
            } else if (rest == 20) {
                buchstaben.put(7, "U");
                buchstaben.put(8, "T");
                buchstaben.put(9, "D");
                buchstaben.put(10, "H");
            } else if (rest == 21) {
                buchstaben.put(7, "U");
                buchstaben.put(8, "H");
                buchstaben.put(9, "T");
                buchstaben.put(10, "D");
            } else if (rest == 22) {
                buchstaben.put(7, "U");
                buchstaben.put(8, "H");
                buchstaben.put(9, "D");
                buchstaben.put(10, "T");
            } else if (rest == 23) {
                buchstaben.put(7, "U");
                buchstaben.put(8, "D");
                buchstaben.put(9, "T");
                buchstaben.put(10, "H");
            } else {
                buchstaben.put(7, "U");
                buchstaben.put(8, "D");
                buchstaben.put(9, "H");
                buchstaben.put(10, "T");
            }

            buchstaben.put(11, "L");
            buchstaben.put(12, "G");
            buchstaben.put(13, "O");
            buchstaben.put(14, "C");
            buchstaben.put(15, "M");
            buchstaben.put(16, "B");
            buchstaben.put(17, "F");

            String w1 = buchstaben.get(3) + buchstaben.get(4);
            String w2 = buchstaben.get(16) + buchstaben.get(2) + buchstaben.get(1) + buchstaben.get(5) + buchstaben.get(1);
            String w3 = buchstaben.get(6) + buchstaben.get(8) + buchstaben.get(10) + buchstaben.get(9) + buchstaben.get(7) + buchstaben.get(2) + buchstaben.get(10) + buchstaben.get(9) + buchstaben.get(11);
            String w4 = buchstaben.get(12) + buchstaben.get(3);
            String w5 = buchstaben.get(17) + buchstaben.get(1) + buchstaben.get(5) + buchstaben.get(1) + buchstaben.get(6);
            String w6 = buchstaben.get(15) + buchstaben.get(8) + buchstaben.get(3) + buchstaben.get(14) + buchstaben.get(1) + buchstaben.get(6);
            String w7 = buchstaben.get(5) + buchstaben.get(2) + buchstaben.get(1);
            String w8 = buchstaben.get(13) + buchstaben.get(7) + buchstaben.get(1) + buchstaben.get(4) + buchstaben.get(2) + buchstaben.get(3) + buchstaben.get(4);

            String wort = w1 + " " + w2 + " " + w3 + " " + w4 + " " + w5 + " " + w6 + " " + w7 + " " + w8;

            System.out.println(wort);
        }
    }
}
