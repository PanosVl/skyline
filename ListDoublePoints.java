public class ListDoublePoints {

	// κλάση που ορίζει τη συνδεδεμένει λίστα
	// και τις μεθόδους της

	// αναφορά στο πρώτο DoublePoint της λίστας
	public DoublePoint first;

	// constructor
	public ListDoublePoints() {

		first = null; 		// δηλώνει οτι δεν υπάρχει (ακόμα) κανένα στοιχείο στη λίστα 

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

	// διαγράφει το στοιχείο με συντεταγμένες (a, b) απο τη λίστα
	public DoublePoint delete(double a, double b) {
		
		DoublePoint current = first;
		DoublePoint previous = first;

		while (current.x != a) 
		{
			if (current.next == null)
				// έφτασε στο τέλος της λίστας 
				// χωρίς να βρεί το στοιχείο με (a, κάτι)
				return null;
			else
			{
				// προχώρα στο επόμενο στοιχείο
				previous = current;
				current = current.next;
			}
		}
		// βρέθηκε
		if (current == first)
			// αν είναι το πρώτο στοιχείο, άλλαξέ το
			first = first.next;
		else
			// αλλιώς προσπέρασέ το
			previous.next = current.next;

		return current;
	}


	// εμφανίζει τη λίστα
	public void displayList() {

		System.out.println("List: ");

		// ξεκίνα απο την αρχή της λίστας
		DoublePoint current = first;

		// μέχρι το τέλος της
		while (current != null)
		{
			current.displayDoublePoint(); // τύπωσε το στοιχείο 
			current = current.next;		  // βάλε τον current να δείχνει μια θέση μπροστά
		}
		System.out.println("");
	}
}
