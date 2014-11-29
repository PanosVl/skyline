public class DoublePoint {

	// κλάση που περιέχει τον κόμβο
	// λίστας και τα δεδομένα του 

	// αναφέρεται στον επόμενο DoublePoint στη λίστα
	public DoublePoint next; 

	// συντεταγμένες του κάθε στοιχείου (δεδομένα)
	public double x;
	public double y;

	// constructor
	public DoublePoint ( double a, double b ) {
		a = x;
		b = y;
		// η 'next' αρχικοποιείται αυτόματα με την τιμή null
	}

	// μέθοδος για την εφμάνιση του κόμβου λίστας
	public void displayDoublePoint() {
		System.out.print("{" + x + ", " + y + "} ");
	}
	
}