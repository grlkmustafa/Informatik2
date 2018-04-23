package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe_7b {

    public static void main(String[] args) {

        try {

            Matrix a = new Matrix(2, 3);

            for(int i = 0; i < 2; ++i) {

                for(int j = 0; j < 3; ++j) {
                    a.setValue(i, j, 1);
                }
            }

        } catch (DataFormatException dfe) {

            System.err.println("Erzeugung oder Änderung von Hobby fehlgeschlagen");

        }
    }
}