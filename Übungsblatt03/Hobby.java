package kapitel05;

import java.util.zip.DataFormatException;

public class Hobby {


    private String name;
    private int priority;

    public Hobby(String name) throws DataFormatException {

        if(!setName(name))
            throw new DataFormatException("Name nicht passend gesetzt");
        this.priority = 1;

    }

    public Hobby(String name, int priority) throws DataFormatException {

        setName(name);
        setPriority(priority);

    }


    private boolean setName(String name) {

        if(checkName(name))
            this.name = name;
        return(this.name.equals(name));

    }

    public void setPriority(int priority) throws DataFormatException {

        if(!checkPriority(priority)) {
            throw new DataFormatException("Priorität nicht passend gesetzt");
        }
        this.priority = priority;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    private static boolean checkPriority(int priority) {

        return(priority > 0 && priority < 6);

    }

    private static boolean checkName(String name) {

        return(name.length() > 0);

    }
}
