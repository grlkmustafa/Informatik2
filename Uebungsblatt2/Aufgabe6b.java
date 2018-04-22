import java.util.ArrayList;
import java.lang.Math;

public class Aufgabe6b {
  public static void main(String[] args) {
      ArrayList<Double> list = new ArrayList<Double>();

      double sum = 0;
      double average = 0;
      double n = Math.ceil(Math.random() * 100000);

      for(int i = 0; i < n; i++) {
        list.add(Math.random());
      }

      for(int j = 0; j < n; j++) {
      /* Addiert alle Eintraege aus der ArrayList */
      sum += list.get(j);
      }

      /* Printed den Durchschnitt der ArrayList Eintraege */
      System.out.println(average = sum / n);

  }
}
