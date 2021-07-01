package assignment;

import java.util.Comparator;

public class Student5 implements Comparator<Student1> {

	int id;
	String name;
	int age;
	double marks;
	int standard;
	public Student5(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}
	
	public Student5() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}
	
	public int compare(Student5 o1, Student5 o2) {
		
		return o1.standard-o2.standard;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
