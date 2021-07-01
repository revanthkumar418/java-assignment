package assignment;

import java.util.Comparator;

public class Student3 implements Comparator<Student1>{

	int id;
	String name;
	int age;
	double marks;
	int standard;
	public Student3(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}
	
	public Student3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}
	
	public int compare(Student3 o1, Student3 o2) {
		
		return o1.age-o2.age;
	}
	@Override
	public int hashCode() {
		return this.hashCode();
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
