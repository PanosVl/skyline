public class SkylineAlg1 {

  private static int counter = 0;            // αριθμός συγκρίσεων

	public static ListDoublePoints skyline1( ListDoublePoints list ) {
	  DoublePoint  current = list.first; 			// αρχή της λίστας
		DoublePoint  previous = current.next; 		// το δεύτερο στοιχείο της λίστας

		while (previous != null) 
		{
          	current = list.first;	
           	while (current != null) 
           	{
               	counter++;

                if ((current.x > previous.x && current.y >= previous.y) || (current.x >= previous.x && current.y > previous.y))
                {
					list.delete(current);
				}
                counter++;
                if ((current.x < previous.x && current.y <= previous.y) || (current.x <= previous.x && current.y < previous.y))
                {
                    list.delete(previous);
                    break;
                }
                current = current.next;
           	}
           	previous = previous.next;
        }
		return list;
	}

    public static int getCost() {
        return counter;
    }
	
}
