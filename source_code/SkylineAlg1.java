public class SkylineAlg1 {

	public ListDoublePoints skyline1( ListDoublePoints list ) {
	  DoublePoint  previous = list.first; 			// αρχή της λίστας
		DoublePoint  current = previous.next; 			// το δεύτερο στοιχείο της λίστας

		while (previous != null) 
		{
          	DoublePoint tempPrevious = previous.next;	// βοηθητική μεταβλητή temp δείχνει previous +1
           	while (current != null) 
           	{
               	DoublePoint tempCurrent = current.next;
                if ((previous.x <= current.x && previous.y < current.y) || (previous.x < current.x && previous.y <= current.y) || (previous.x < current.x && previous.y <current.y))
                {
					list.delete(current);
				}
                else
                {
                    list.delete(previous);
                    break;
                }
                current = tempCurrent;
           	}
           	current = list.first;
           	previous = tempPrevious;
        }
		return list;
	}
	
}
