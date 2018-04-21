public class Aufgabe5b {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    for(int i = 0; i < args.length; i++){
      s.append(args[i]);
    }
    System.out.println(s.length());
  }
}
