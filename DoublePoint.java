public class DoublePoint {

	// κλάση που περιέχει τον κόμβο
	// λίστας και τα δεδομένα του 

	// συντεταγμένες του κάθε στοιχείου (δεδομένα)
	public double x, y;
	
	// αναφέρεται στον επόμενο DoublePoint στη λίστα
	public DoublePoint next; 


	// constructor
	public DoublePoint ( double a, double b ) {
		x = a;
		y = b;
	}

	// μέθοδος για την εφμάνιση του κόμβου λίστας
	public void displayDoublePoint() {
		System.out.print("{" + x + ", " + y + "} " + "\n");
	}
	
}