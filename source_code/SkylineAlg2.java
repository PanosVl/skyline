public class SkylineAlg2 {

	private static int counter = 0;

	public static ListDoublePoints skyline2( ListDoublePoints list ) {

		list = SortList.getSorted(list);

		DoublePoint current = list.first;
		DoublePoint previous = current.next;

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
