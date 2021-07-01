package assignment;

import java.util.ArrayList;
import java.util.Collections;


public class Sorting {

	public static void idsort(ArrayList<Student1> arrayList) {
		System.out.println("Sorted by id");
	
		Collections.sort(arrayList, new Student1());
		for (Student1 student1 : arrayList) {
			System.out.println(student1);
		}

	}
	public static void namesort(ArrayList<Student1> arrayList) {
		System.out.println("Sorted by name");
		Collections.sort(arrayList, new Student2());
		for (Student1 student1 : arrayList) {
			System.out.println(student1);
		}
		
		
	}
	public static void agesort(ArrayList<Student1> arrayList) {
		System.out.println("Sorted by age");
		
		Collections.sort(arrayList, new Student3());
		for (Student1 student3 : arrayList) {
			System.out.println(student3);
		}
	}


		public static void markssort(ArrayList<Student1> arrayList) {
			System.out.println("sorted by maarks");
	
			Collections.sort(arrayList, new Student4());
			for(Student1 student4:arrayList) {
				System.out.println(student4);
			}
		}
		public static void standardsort(ArrayList<Student1> arrayList) {
			System.out.println("sorted by Standards");
		
			Collections.sort(arrayList, new Student5());
			for(Student1 student5:arrayList) {
				System.out.println(student5);
			}
		}
		}
