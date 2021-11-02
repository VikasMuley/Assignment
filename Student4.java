package comparatorAssgn;

import java.util.Comparator;

class Student4 implements Comparator<Student4> {
	int id;
	String name;
	int marks;
	int age;
	public Student4(int id, String name, int marks, int age) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Id " + id +"\n"+ "Name=" + name+"\n" + "Marks=" + marks+"\n" + "Age=" + age+"\n" ;
	}


	@Override
	public int compare(Student4 o1, Student4 o2) {
		return o1.id-o2.id;
	}

	
	
	
	
	 

}
