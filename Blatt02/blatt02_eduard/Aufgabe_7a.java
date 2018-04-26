package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe_7a {

    public static void main(String[] args) {

        try {

            Hobby lesen =  new Hobby("Lesen");
            lesen.setPriority(lesen.getPriority() + 1);

        } catch (DataFormatException dfe) {

            System.err.println("Erzeugung oder Änderung von Hobby fehlgeschlagen");

        }
    }
}