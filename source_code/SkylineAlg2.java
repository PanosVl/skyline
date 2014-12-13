public class SkylineAlg2 {

	public ListDoublePoints skyline2 (ListDoublePoints list) {
		DoublePoint previous = list.first;
		DoublePoint current = previous.next;

		while (previous != null)
		{
			DoublePoint tempPrevious = previous.next;			// βοηθητική μεταβλητή για να κρατήσω τη θέση
			
			while (current != null)
			{
				DoublePoint tempCurrent = current.next;			// βοηθητική μεταβλητή για να κρατήσω τη θέση
				if (previous.dominates(current))
					list.delete(current);
				else if (current.dominates(previous))
					list.delete(previous);
				current = tempCurrent;
			}
			current = previous.next;
			previous = tempPrevious;	
		}
		return list;
	}
}
