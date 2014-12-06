import java.util.*;

public class MySkylineApp {

	public static void main (String[] args) {
		
		// δημιουργία αντικειμένου generator τύπου Random για την παραγωγή
		// τυχαίων αριθμών
		Random generator = new Random();

		// δημιουργία αντικειμένου input τύπου Scanner για την είσοδο απο
		// το χρήστη
		Scanner input = new Scanner(System.in);
		

		// δημιουργία πανομοιότυπων λιστών για τους 2 αλγόριθμους skyline
		ListDoublePoints list1 = new ListDoublePoints();
		ListDoublePoints list2 = new ListDoublePoints();
		/*
		// εισαγωγή πλήθους (n) σημείων από το χρήστη
		System.out.println("Εισάγετε σύνολο σημείων: ");
		int n = input.nextInt();

		// εισαγωγή τυχαίων σημείων στις 2 λίστες
		for (int i = 0; i < n; i++)
		{
			double a = generator.nextDouble()*10000;
			double b = generator.nextDouble()*10000;
			list1.insertFirst(a, b);
			list2.insertFirst(a, b);
		}
		
		// εκτύπωση λίστας πριν εκτελεστεί ο 1ος αλγόριθμος
		list1.displayList();
		SkylineAlg1 nonStaticTester = new SkylineAlg1();
		nonStaticTester.getSkyline(list1);
		System.out.println("==========SKYLINE__1__==========");
		list1.displayList();*/
		
		list1.insertFirst(1, 9);
		
		list1.insertFirst(2,10);
		
		list1.insertFirst(4,8);
		
		list1.insertFirst(9,2);

		list1.insertFirst(10,10);

		System.out.println("===========unSORTED===========");
		list1.displayList();
		
		/*SkylineAlg1 test = new SkylineAlg1();
		list1 = test.getSkyline(list1);*/
		System.out.println("===========SORTED===========");
		SortList test = new SortList();
		test.getSorted(list1);
		list1.displayList();

		
		/*list2.insertFirst(1, 9);
		list2.insertFirst(2,10);
		list2.insertFirst(4,8);
		list2.insertFirst(9,2);
		list2.insertFirst(10,10);
		System.out.println("==========UNSORTED==========");
		list2.displayList();

		System.out.println("");

		System.out.println("===========SORTED===========");
		SortList.getSorted(list2);
		list2.displayList();*/


		

	}
}
