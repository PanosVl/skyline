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
                   if (previous.dominates(current) == true) 
                       list.delete(current);
                   else if (current.dominates(previous) == true) 
                       list.delete(previous);
	         		current = tempCurrent;				// μετά τις αλλαγές,θέτω τον current στη θέση που πρέπει να είναι (previous.next)
           	}
           	current = list.first;
           	previous = tempPrevious;
        }
		return list;
	}
	
}