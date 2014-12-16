public class DoublePoint {

	// κλάση που περιέχει τον κόμβο
	// λίστας και τα δεδομένα του 

	// αναφέρεται στον επόμενο DoublePoint στη λίστα
	public DoublePoint next; 

	// συντεταγμένες του κάθε στοιχείου (δεδομένα)
	public double x;
	public double y;

	// constructor χωρίς διαστάσεις
	public DoublePoint() {
        //if called with empty contructor, then two random numbers in radius (0,10) are set to x and y.
        x = (int) (Math.random() * ((10) + 1));
        y = (int) (Math.random() * ((10) + 1));
    }

    // constructor με συγκεκριμένες διαστάσεις
	public DoublePoint ( double a, double b ) {
		x = a;
		y = b;
		// η 'next' αρχικοποιείται αυτόματα με την τιμή null
	}

	// μέθοδος για την εφμάνιση του κόμβου λίστας
	public void displayDoublePoint() {
		System.out.println("{" + x + ", " + y + "} ");
	}
	
}
