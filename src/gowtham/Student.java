package gowtham;

public class Student {
	int rollno;
	String name;
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=100;
		s1.name="Raju";
		s1.display();
		Student s2=new Student();
		s2.rollno=101;
		s2.name="kamal";
		s2.display();
				
	}

}
