import java.util.*;
import java.io.*;

public class MySkylineApp {
	public static void main (String[] args) {

		// δημιουργία Scanner για είσοδο απο το χρήστη
		Scanner input = new Scanner(System.in);
		
		// δημιουργία πανομοιότυπων λιστών για τους 2 αλγόριθμους skyline
		ListDoublePoints list1 = new ListDoublePoints();
		ListDoublePoints list2 = new ListDoublePoints();
		int totalElements = 0;

		System.out.println("Πιέστε 1 για τυχαίους αριθμούς || 2 για είσοδο απο αρχείο");
		int user = input.nextInt();
		if (user == 1)
		{
			System.out.println("Please enter the number of elements you want to generate:");
			int n = input.nextInt();
			totalElements = n;

			Random generate = new Random();
			for (int i = 0; i < n; i++)
			{
				double a = generate.nextDouble()*10000;
				double b = generate.nextDouble()*10000;
				list1.insertFirst(a,b);
				list2.insertFirst(a,b);
			}
		}
		else if (user == 2)
		{
			System.out.println("Give the file's full path:");
			/*String filePath = input.nextLine();
			int sum = 0;		// πλήθος στοιχείων
			BufferReader feed = null;

			try
			{
				feed = new BufferReader(new FileReader(filePath));
				String ln; // line
				while ((line = feed.readLine()) != null)
				{
					sum++;
					String[] parts = line.split(" ");
					insertData(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
				}
			}
			catch (IOException e) {} 
			finally 
			{
	            if (feed != null)
	            {
	            	try
	            	{
	            		in.close();
	            	}
	            	catch 
	            	(IOException e) {}
	            }
        	}*/
		}
		else
		{
			while (user != 1 || user != 2)
			{
				System.out.println("Invalid input.Please enter only 1 or 2.");
				user = input.nextInt();
			}
		}

		// ------------------AND HERE STARTS THE FUN-------------------

		long before = new Date().getTime();
		ListDoublePoints test1 = SkylineAlg1.skyline1(list1);
		long after = new Date().getTime();
		long power1 = after - before;
		int cost = SkylineAlg1.getCost();
		System.out.printf("Checked %d elements with Skyline1 in %d steps and %d miliseconds.", totalElements, cost, power1);
        test1.displayList();

        before = new Date().getTime();
		ListDoublePoints test2 = SkylineAlg2.skyline2(list2);
		after = new Date().getTime();
		long power2 = after - before;
		int cost2 = SkylineAlg2.getCost();
		System.out.printf("Checked %d elements with Skyline2 in %d steps and %d miliseconds.", totalElements, cost, power1);
        test2.displayList();
		/*
		// εισαγωγή δοκιμαστικών στοιχείων και στις δύο λίστες
		list1.insertFirst(1, 9);
		list1.insertFirst(2,10);
		list1.insertFirst(4,8);
		list1.insertFirst(9,2);
		list1.insertFirst(10,1000);
		System.out.println("Before Skylining");
		list1.displayList();

		SkylineAlg1 test = new SkylineAlg1();
		list1 = test.skyline1(list1);
		System.out.println("After Skylining");
		list1.displayList();
		
		list2.insertFirst(1, 9);
		list2.insertFirst(2,10);
		list2.insertFirst(4,8);
		list2.insertFirst(9,2);
		list2.insertFirst(10,1000);
		System.out.println("Before skyline");
		list2.displayList();
		
		SkylineAlg2 test = new SkylineAlg2();
		list2 = test.skyline2(list2);
		System.out.println("After skyline");
		list2.displayList();
		*/
	}
}
