public class SkylineAlg2 {

		// foreach p in list |p|
		// 	foreach q in list |q| after p
		//    if p dominates q
		//       pop q
	public ListDoublePoints getSkyline2( ListDoublePoints list) {

		DoublePoint  previous = list.first; // αρχή της λίστας
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
					}
				}
				current = current.next;
				
			}
			previous = previous.next;
		}
		return list;	
	}
		
}
