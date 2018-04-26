package blatt02;

import java.util.ArrayList;

public class Aufgabe_6b {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>();

		int random = (int) Math.floor((Math.random() * 100000) + 1);
		double sum = 0;
		
		for (int i = 0; i < random; ++i) {
			
			try {
			
			Double n = new Double(Math.random());
			list.add(n);
			
			} catch (NumberFormatException nfe) {
			
			System.err.println("Erzeugung von Zufallszahl fehlgeschlagen");
			
			}
		}
		for(int i = 0; i < random; ++i) {
			
			try {
			
			sum += list.get(i);
			
			} catch (IndexOutOfBoundsException oob) {
			
			System.err.println("Addition fehlgeschlagen");
			
			}
			
		}
		System.out.println(sum/random);
}
}