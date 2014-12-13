public class DoublePoint {

	// κλάση που περιέχει τον κόμβο
	// λίστας και τα δεδομένα του 

	// αναφέρεται στον επόμενο DoublePoint στη λίστα
	public DoublePoint next; 

	// συντεταγμένες του κάθε στοιχείου (δεδομένα)
	public double x;
	public double y;

	// κενός constructor (παίρνει τυχαίες τιμές)
	// constructor
	public DoublePoint () {
		x = (int) (Math.random() * ((10) + 1));
		y = (int) (Math.random() * ((10) + 1));
	}

	public DoublePoint ( double a, double b ) {
		x = a;
		y = b;
		// η 'next' αρχικοποιείται αυτόματα με την τιμή null
	}

	public boolean dominates(DoublePoint param) {
        if ((this.x <= param.x && this.y < param.y) || (this.x < param.x && this.y <= param.y) || (this.x < param.x && this.y < param.y))
            return true;
        else 
       		return false;
    }

	// μέθοδος για την εφμάνιση του κόμβου λίστας
	public void displayDoublePoint() {
		System.out.println("{" + x + ", " + y + "} ");
	}
	
}