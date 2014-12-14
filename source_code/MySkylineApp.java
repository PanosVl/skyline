import java.util.*;
import java.io.*;

public class MySkylineApp {
	public static void main (String[] args) {
		
		// δημιουργία πανομοιότυπων λιστών για τους 2 αλγόριθμους skyline
		ListDoublePoints list1 = new ListDoublePoints();
		ListDoublePoints list2 = new ListDoublePoints();

		
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
		/*
		list2.insertFirst(1, 9);
		list2.insertFirst(2,10);
		list2.insertFirst(4,8);
		list2.insertFirst(9,2);
		list2.insertFirst(10,1000);
		System.out.println("Before sorting");
		list2.displayList();
		
		SortList test = new SortList();
		list2 = test.getSorted(list2);
		System.out.println("After sorting");
		list2.displayList();
		*/
		
		

	}
}
