public class SortList {

	// κλάση υπεύθυνη για την
	// ταξινόμηση της συνδεδεμένης λίστας

	// δέχεται μια συνδεδεμένη λίστα ώς παράμετρο
	// και την επιστρέφει ταξινομημένη
	// την έκανα static για να μπορεί να κληθεί χωρίς δημιουργία αντικειμένου
    public static ListDoublePoints getSorted( ListDoublePoints list ) {

		DoublePoint current = list.first;
        DoublePoint previous = current.next;
        while (previous != null)
        {
            current = list.first;
            while (current != null)
            {
                if ((previous.x + previous.y) > (current.x + current.y))
                {
                    double tempX = previous.x;
                    double tempY = previous.y;
                    previous.x = current.x;
                    previous.y = current.y;
                    current.x = tempX;
                    current.y = tempY;
                }
                current = current.next;
            }
            previous = previous.next;
        }
		return list;

	}
}
