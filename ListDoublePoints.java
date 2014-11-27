public class ListDoublePoints {

	// κλάση που ορίζει τη συνδεδεμένει λίστα
	// και τις μεθόδους της

	// αναφορά στο πρώτο DoublePoint της λίστας
	private DoublePoint first;

	// constructor
	public ListDoublePoints() {

		first = null; // δηλώνει οτι δεν υπάρχει (ακόμα) κανένα στοιχείο στη λίστα 

	}
	
	// ελέγχει αν η λίστα είναι άδεια
	// επιστρέφοντας αντίστοιχη boolean τιμή
	public boolean isEmpty() {
		return (first == null);
	}

	// εισάγει στοιχεία DoublePoint στην αρχή της λίστας
	public void insertFirst(double x, double y) {

		// δημιουργία του σημείου και της σύνδεσής του
		// στη λίστα
		DoublePoint newPoint = new DoublePoint(x,y);

		// το newPoint θα δείχνει εκεί που έδειχνε το 
		// προηγούμενο σημείο (το παλιό πρώτο)
		newPoint.next = first;

		// το first θα δείχνει το newPoint
		// (κάνω το newPoint το πρώτο στοιχείο της λίστας)
		first = newPoint;
	}
}
