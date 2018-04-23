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
