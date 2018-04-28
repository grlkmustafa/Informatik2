package kapitel05;

import java.util.zip.DataFormatException;

public class Aufgabe_9a {

    public static void main(String[] args) {


        double x, y, radius;
        Point p;
        Circle c;

        if((args.length % 3) != 0 || args.length == 0) {

            System.err.println("Falsche Anzahl an Parametern übergeben");

        }


            for (int i = 0; i < args.length / 3; ++i) {

                try {

                x = Double.valueOf(args[i * 3]);
                y = Double.valueOf(args[(i * 3) + 1]);
                radius = Double.valueOf(args[(i * 3) + 2]);
                p = new Point(x, y);
                c = new Circle(radius, p);

                } catch (DataFormatException dfe) {

                    System.err.println(dfe.getMessage());

                } catch (NumberFormatException nfe) {

                    System.err.println("Konnte die Parameter bei Kreis " + (i + 1) + " nicht auflösen");

                }

            }

        System.out.println(Circle.getCount());
    }
}
