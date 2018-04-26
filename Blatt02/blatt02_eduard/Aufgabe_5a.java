package blatt02;

public class Aufgabe_5a {

	public static void main(String[] args) {
		
			if (args.length != 2) {
			System.err.println("Falsche Anzahl an Parametern");
		}
		
		if (args[0].contentEquals("-o") && Character.isDigit(args[1].charAt(0))) {
		
			System.out.println("ok");
			
		} else {
		
			System.out.println("nicht ok");
		
		}
}
}