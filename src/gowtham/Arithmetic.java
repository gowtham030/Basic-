package gowtham;

	public class Arithmetic {
		int a,b;
		Arithmetic(int x,int y)
		{
			a=x;
			b=y;
		}
		void add()
		{
			System.out.println(a+b);
		}
		void sub(int k,int l)
		{
			System.out.println(k-l);
		}
		void mul(int t,int u)
		{
			System.out.println(t*u);
		}
		void div(int c,int d)
		{
		System.out.println(c/d);	
		}
		
		public static void main(String[] args) {
			Arithmetic ar=new Arithmetic(5,6);
			ar.add();
			ar.sub(40,20);
			ar.mul(3,4);
			ar.div(40,10);
		}
		
}
