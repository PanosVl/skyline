public class SkylineAlg1 {

		public ListDoublePoints skyline1( ListDoublePoints list ) {
			DoublePoint  previous = first; // αρχή της λίστας
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
								delete(current.x, current.y);
							else
							{
								// ΚΥΡΙΑΡΧΙΑ q στο p
								delete(previous.x, previous.y);
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
								delete(current.x, current.y);
							else
							{
								// ΚΥΡΙΑΡΧΙΑ q στο p
								delete(previous.x, previous.y);
								break;
							}
						}
					}
					current = current.next;
					
				}
				previous = previous.next;
			}	
		}
	
}
