package gowtham;

public class Packagegod1 {
	public class classumreverse{
		int a;
		int n;
		void sum()
		{
			while (n>0)
			{
				a=a+n%10;
				n=n/10;
			}
				System.out.println(a);
		}
				int reverse()
		
				{
					int a=0;
					int n=757;
					while(n>0)
			{
				a=(a*10)+(n%10);
				n=n/10;
			}
			System.out.println(a);
			return a;
			n=n/10;
			}
	public static void main(String[] args) {
		Packagegod1 P=new Packagegod1 ();
		int k=p.reverse ();
		p.n=757;
		if (n==p.n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		}
	}

}