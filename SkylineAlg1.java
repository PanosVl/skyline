public class SkylineAlg1 {

		DoublePoint  previous = first; // αρχή της λίστας
		DoublePoint current = previous.next; // το δεύτερο στοιχείο της λίστας

		// foreach p in list |p|
		while (current != null) 
		{
			
			// foreach q in list |q|
			while (next != null)  
			{
				//    if p dominates q
				if (current.x + current.y <= next.x + next.y)
				{
					// delete q
				}
				else
				{
					// delete previous
					// next p
				}

			}
		}
	
}
