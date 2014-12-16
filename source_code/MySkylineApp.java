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
	

		// ------------------AND HERE STARTS THE FUN-------------------

		long before = new Date().getTime();
		ListDoublePoints test1 = SkylineAlg1.skyline1(list1);
		long after = new Date().getTime();
		long power1 = after - before;
		int cost = SkylineAlg1.getCost();
		System.out.printf("Checked %d elements with Skyline1 in %d steps and %d miliseconds.", totalElements, cost, power1);
        test1.displayList();

       	long before2 = new Date().getTime();
		ListDoublePoints test2 = SkylineAlg2.skyline2(list2);
		long after2 = new Date().getTime();
		long power2 = after - before;
		int cost2 = SkylineAlg2.getCost();
		System.out.printf("Checked %d elements with Skyline2 in %d steps and %d miliseconds.", totalElements, cost2, power2);
        test2.displayList();
	}
}
