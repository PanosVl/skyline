public class SortList {

	// κλάση υπεύθυνη για την
	// ταξινόμηση της συνδεδεμένης λίστας

	// δέχεται μια συνδεδεμένη λίστα ώς παράμετρο
	// και την επιστρέφει ταξινομημένη
	// η μέθοδος ταξινόμησης που χρησιμοποιείται είναι η 
	// MergeSort μιας και είναι η βέλτιστη μέθδος απο αυτές που 
	// έχουμε εξετάσει μέχρι στιγμής (BubbleSort, InsertionSort, SelectionSort)
	public ListDoublePoints getSorted( ListDoublePoints list ) {

				

	}

	public DoublePoint mergeSort(DoublePoint test) {
		if (test == null || test.next == null) {
            return test;
        }
        DoublePoint a = test;
        DoublePoint b = test.next;
        while (b != null && b.next != null) {
            test = test.next;
            b = b.next.next;
        }
        b = test.next;
        node.next = null;
        DoublePoint ready =  merge(mergeSort(a), mergeSort(b));
        return ready;
	}

	public DoublePoint merge(DoublePoint a, DoublePoint b) {
		DoublePoint temp = new DoublePoint();
        DoublePoint head = temp;
        DoublePoint c = head;

        while (a != null && b != null) {
            if (a.x + a.y <= b.x + b.y) {
                c.next = a;
                c = a;
                a = a.next;
            } else {
                c.next = b;
                c = b;
                b = b.next;
            }
        }

        c.next = (a == null) ? b : a;
        return head.next;
	}
}
