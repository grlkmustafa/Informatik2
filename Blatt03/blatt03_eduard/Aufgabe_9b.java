package kapitel05;

import java.util.zip.DataFormatException;

public class Aufgabe_9b {

    public static void main(String[] args) {

        Contact c;


        if(args.length == 0) {

            System.err.println("Keine Paramater angegeben");
        }

        try {

            c = new Contact(args[0]);
            for (int i = 1; i < args.length; ++i) {

                 if (i == 1) {

                    c.setBirthday(args[i]);

                } else {

                    c.addTelephone(args[i]);

                }
            }

            for (int i = 0; i < c.getCountTelephone(); ++i) {

                System.out.println(c.getTelephone(i));

            }

        } catch (DataFormatException dfe) {

            System.err.println(dfe.getMessage());
        }



    }
}
