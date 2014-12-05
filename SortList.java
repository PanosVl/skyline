public class SortList {
	
	// κλάση υπεύθυνη για την
	// ταξινόμηση της συνδεδεμένης λίστας

	// δέχεται μια συνδεδεμένη λίστα ώς παράμετρο
	// και την επιστρέφει ταξινομημένη
	public static ListDoublePoints getSorted( ListDoublePoints list ) {

		// ξεκίνα απο την αρχή της λίστας
		DoublePoint previous = list.first;
		DoublePoint current = previous.next;
		double sumP, sumC;
		DoublePoint temp;

		while (previous != null)
		{
			while (current != null)
			{
				sumC = current.x + current.y;
				sumP = previous.x + previous.y;
				if (sumC < sumP)
				{
					temp = current;
					current = previous;
					previous = temp;
					break;
				}
				current = current.next;
			}
			previous = previous.next;
		}
		return list;
	}

}
