package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student1> arrayList=new ArrayList<Student1>();
		arrayList.add(new Student1(2, "nasar", 18, 95.9, 6));
		arrayList.add(new Student1(4, "ram",   19, 85.9, 8));
		arrayList.add(new Student1(3, "arul",  23, 74.9, 11));
		arrayList.add(new Student1(1, "karan", 20, 63.9, 10));
		arrayList.add(new Student1(5, "eswar", 21, 78.9, 12));
		//int id, String name, int age, double marks, int standard
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter sorting order according to");
			int a=sc.nextInt();
		if(a==1) {
			Sorting.idsort(arrayList);
			break;
		}else if(a==2) {
			Sorting.namesort(arrayList);
			System.exit(0);
		}else if(a==3) {
			Sorting.agesort(arrayList);
			break;
		}
		else if(a==4) {
			Sorting.markssort(arrayList);
			break;
		}else if(a==5)
		{
			student.Sorting.Standardsort(arrayList);
			break;
		}else {
        break; 
	}
	}
	}
}
