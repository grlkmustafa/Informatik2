Übungsblatt 2
==============

Aufgabe 5

a) 

```java
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

```
b)

```java
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
```

Aufgabe 6

a)

```java
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
```

b)

```java
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
```

Aufgabe 7

- ai)

      - Attribut 'name': String, muss zwischen 1 und 20 Zeichen haben

      - Attribut 'priority': Int, muss zwischen 1 und 5 liegen

- aii)

```java

package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe_7a {

    public static void main(String[] args) {

        try {

            Hobby lesen =  new Hobby("Lesen");
            lesen.setPriority(lesen.getPriority() + 1);

        } catch (DataFormatException dfe) {

            System.err.println("Erzeugung oder Änderung von Hobby fehlgeschlagen");

        }
    }
}

```
  
Klasse Hobby zu aii)

```java
package blatt02;

import java.util.zip.DataFormatException;

public class Hobby {

    private String name;
    private int priority;

    public Hobby(String name) throws DataFormatException {
        setName(name);
        this.priority = 1;
    }

    public int getPriority() {
        return this.priority;
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
```

- bi)

      - Attribut 'rowDimension' mit Datenstrukturinvariante Integer

      - Attribut 'columnDimension' mit Datenstrukturinvariante Integer
	  
	  - beide Attribute müssen größer 0 sein

- bii)

```java
package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe_7b {

    public static void main(String[] args) {

        try {

            Matrix a = new Matrix(2, 3);

            for(int i = 0; i < 2; ++i) {

                for(int j = 0; j < 3; ++j) {
                    a.setValue(i, j, 1);
                }
            }

        } catch (DataFormatException dfe) {

            System.err.println("Erzeugung oder Änderung von Hobby fehlgeschlagen");

        }
    }
}

```

Klasse Matrix zu bii)

```java
package blatt02;

import java.util.zip.DataFormatException;

public class Matrix {

    private int rowDimension;
    private int columnDimension;
    private int values[][];

    public Matrix(int rowDimension, int columnDimension)
            throws DataFormatException {
        setRowDimension(rowDimension);
        setColumnDimension(columnDimension);
        values = new int[rowDimension][columnDimension];
    }

    private void setRowDimension(int rowDimension) throws DataFormatException {
        if (!checkRowDimension(rowDimension))
            throw new DataFormatException("RowDimension invalid");
        this.rowDimension = rowDimension;
    }

    private static boolean checkRowDimension(int rowDimension) {
        return (rowDimension > 0);
    }

    private void setColumnDimension(int columnDimension)
            throws DataFormatException {
        if (!checkColumnDimension(columnDimension))
            throw new DataFormatException("ColumnDimension invalid");
        this.columnDimension = columnDimension;
    }

    private static boolean checkColumnDimension(int columnDimension) {
        return (columnDimension > 0);
    }

    public void setValue(int row, int column, int value) {
        values[row][column] = value;
    }

}

```


Aufgabe 8

```java
package blatt02;

import java.util.zip.DataFormatException;

public class Property {

    private double Price;
    private int Size;

    public Property(double Price, int Size)
	    throws DataFormatException {
	setPrice(Price);
	setSize(Size);
	this.Price = Price;
	this.Size = Size;
    }

    public void setPrice(double Price) throws DataFormatException {
	if (!checkPrice(Price))
	    throw new DataFormatException("Price invalid");
	this.Price = Price;
    }

    private static boolean checkPrice(double Price) {

        return (Price > 0);

    }

    public void setSize(int Size)
	    throws DataFormatException {
	if (!checkSize(Size))
	    throw new DataFormatException("Size invalid");
	this.Size = Size;
    }

    private static boolean checkSize(int Size) {

        return (Size > 0);

    }

    public double getPrice() {
        return this.Price;
    }

    public static double getFee() {

        return 3.45;

    }


}
```

Main zu Aufgabe 8

```java
package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe08 {

    public static void main(String args[]) {
        try {
            Property p = new Property(100000.0, 34);
            p.setPrice(p.getPrice() * 1.1);
            System.out.println("Fee: " + p.getPrice() * Property.getFee() / 100);
        } catch (DataFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
```
