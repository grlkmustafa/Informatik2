package kapitel05;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class Student {


    private ArrayList<String> email = null;

    public void addEmail(String email) throws DataFormatException {
        if (!checkEmail(email))
            throw new DataFormatException("Objekt Student: Email ungueltig");
        if (this.email.contains(email)) {
            throw new DataFormatException("Objekt Student: Email schon vorhanden");
        }
        this.email.add(email);
    }
    public void deleteEmail(String email) {

        this.email.remove(email);
    }

    public ArrayList<String> getEmail() {

        ArrayList<String> copy = new ArrayList<>();
        for (String number : this.email) {
            copy.add(number);
        }
        return copy;
    }

    public int getCountEmail() {

        return this.email.size();
    }

    private boolean checkEmail(String email) {

        String[] copy = email.split("@");
        if (copy.length != 2) {

            return (false);

        } else {

            return copy[0] != null && copy[1] != null;

        }

    }
}
