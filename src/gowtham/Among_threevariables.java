package gowtham;

public class Among_threevariables {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	if (a<b)
	if (b<c)
	{
	--a;
	} 
	else {
    --b;
	} else {
	--c;
	}
	a=(a+b+c);
	System.out.println(a);
	}
	}
