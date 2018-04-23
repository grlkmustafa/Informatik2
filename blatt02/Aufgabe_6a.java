package blatt02;

public class Aufgabe_6a {

	public static void main(String[] args) {
		
			if (args.length != 2) {
				throw new IllegalArgumentException("Genau 2 Parameter erwartet");
		}
		
		try {
			
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			System.out.println(a * b);
		} catch (NumberFormatException nfe) {
			
			System.err.println("Error" + nfe.getMessage());
			
		}
		
}
}