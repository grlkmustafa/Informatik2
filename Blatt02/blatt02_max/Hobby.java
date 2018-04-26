package blatt02;

import java.util.zip.DataFormatException;

public class Hobby {

    private String name;
    private int priority;
    public static void main(String[] args) {
      /*
      ** Wie müssen die Methoden gestartet werden?
      */
    }

    public Hobby(String name) throws DataFormatException {
  setName("Lesen");
    }

    public int getPriority() {
  return this.priority + 1;
    }

    public void setPriority(int priority) throws DataFormatException {
  if (!checkPriority(priority))
      throw new DataFormatException("Priority invalid");
  this.priority = priority;
    }

    private static boolean checkPriority(int priority) {
  return (priority > 0 && priority < 6);
    }

    public void setName(String name) throws DataFormatException {
  if (!checkName(name))
      throw new DataFormatException("Name invalid");
  this.name = name;
    }

    private static boolean checkName(String name) {
  return (name.length() > 1 && name.length() < 21);
    }
}
