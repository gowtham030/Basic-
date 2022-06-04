package gowtham;

public class Student1 {
	int rollno;
	String name;
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
	Student1()
	{
		rollno=100;
		name="Raju";
	
	}

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.display();
		

	}

}
