package blatt02;

public class Aufgabe_5b {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < args.length; ++i) {
			
			s.append(args[i]);
			
		}
		
		System.out.println("Länge der Kommandozeilenparameter ist " + s.length());
}
}