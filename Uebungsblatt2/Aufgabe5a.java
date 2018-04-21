import java.io.*;
import java.lang.*;

public class Aufgabe5a {
  public static void main(String[] args) {
    if(args.length == 2 && args[0].equals("-o") && Character.isDigit(args[1].charAt(0))) {
      System.out.println("ok");
      } else {
      System.out.println("Ergebnis: nicht ok");
    }
  }
}

