public class SkylineAlg1 {

	// κλάσση για τον πρώτο αλγόριθμο skyline

	// δημιουργία νέου αντικειμένου ListDoublePoint
	public ListDoublePoints list = new ListDoublePoints();

	
	// constructor
	public SkylineAlg1 (ListDoublePoints inputList) {
		list = inputList;
	}


	// επιστρέφει το Skyline για τη δεδομένη λίστα
	public ListDoublePoints getSkyline() {
		DoublePoint  previous = list.first; // αρχή της λίστας
		// DoublePoint previous = first; 
		DoublePoint  current = previous.next; // το δεύτερο στοιχείο της λίστας

		// για κάθε σημείο p 
		while (previous != null) 
		{
			
			// για κάθε σημείο q 
			while (current != null)  
			{
				// έλεγχος Χ
				if (previous.x <= current.x)
				{
					if (previous.x == current.x)
					{
						if (previous.y < current.y)
							// ΚΥΡΙΑΡΧΙΑ p στο q
							list.delete(current.x, current.y);
						else
						{
							// ΚΥΡΙΑΡΧΙΑ q στο p
							list.delete(previous.x, previous.y);
							break;
						}
					}
				}

				// έλεγχος y
				if (previous.y <= current.y)
				{
					if (previous.y == current.y)
					{
						if (previous.x < current.x)
							// ΚΥΡΙΑΡΧΙΑ p στο q
							list.delete(current.x, current.y);
						else
						{
							// ΚΥΡΙΑΡΧΙΑ q στο p
							list.delete(previous.x, previous.y);
							break;
						}
					}
				}
				current = current.next;
				
			}
			previous = previous.next;
		}
		return list;	
	}
	
}
