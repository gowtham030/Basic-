package gowtham;

public class Parametric {
	int a,b;
	Parametric(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	Parametric pr=new Parametric(5,6);
	pr.add();
	

	}

}
