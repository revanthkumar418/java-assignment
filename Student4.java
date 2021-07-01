package assignment;

import java.util.Comparator;

public class Student4 implements Comparator<Student1> {
	int id;
	String name;
	int age;
	double marks;
	int standard;
	
	public Student4(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}
	
	public Student4() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}
	
	public int compare(Student4 o1, Student4 o2) {
		
		return (int) (o1.marks-o2.marks);
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
