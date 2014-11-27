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

	



	// contains DoublePoints
	DoublePoint a = new DoublePoint(1, 9);
	DoublePoint b = new DoublePoint(2,10);
	DoublePoint c = new DoublePoint(4,8);
	DoublePoint d = new DoublePoint(9,2);
}
