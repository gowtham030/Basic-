package gowtham;

public class Looping_numbers {

	public static void main(String[] args) {
		int num=756;
		a=0;
	    while(num>0)
	    {
	    	a=a+num%10;
            num=num/10;
	    }
	    System.out.println(a);
	    }
}
