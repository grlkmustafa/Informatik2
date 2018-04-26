import java.lang.Double;

public class Aufgabe6a {
  public static void main(String[] args) {
    try {
      if(args.length == 2) {
        double input1, input2;
        input1 = Double.parseDouble(args[0]);
        input2 = Double.parseDouble(args[1]);
        System.out.println(input1*input2);
      }
    } catch(NumberFormatException e) {
      System.err.println("Error "+e.getMessage());
    }
  }
}
