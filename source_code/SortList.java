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
    /* //-----------------------------------------------------------------------
       //ΕΔΩ ΕΚΑΝΑ ΜΙΑ ΠΡΟΣΠΑΘΕΙΑ ΝΑ ΥΛΟΠΟΙΗΣΩ ΤΗ MergeSort ΧΩΡΙΣ ΝΑ ΤΑ ΚΑΤΑΦΕΡΩ
       //----------------ΟΠΟΤΕ ΓΥΡΙΣΑ ΣΤΗ BubbleSort ΑΝΑΓΚΑΣΤΙΚΑ----------------
	public static DoublePoint mergeSort(DoublePoint node) {
        if (node == null || node.next == null) {
            return node;
        }
        DoublePoint a = node;
        DoublePoint b = node.next;
        while (b != null && b.next != null) {
            node = node.next;
            b = b.next.next;
        }
        b = node.next;
        node.next = null;
        return merge(mergeSort(a), mergeSort(b));
    }

    public static DoublePoint merge(DoublePoint a, DoublePoint b) {
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
    */
}
