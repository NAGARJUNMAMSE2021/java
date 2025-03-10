class Tester3
{
	int r=10;
	void disp()
	{
		System.out.println("Java is Programming language");
	}
}
class Tista1 extends Tester3
{
	int x=10;
	void uliya()
	{
		System.out.println("Python is also Programming language");
	}
}
class Mainclass9
{
	public static void main(String[] args)
	{
		Tester3 T1=new Tista1();
		System.out.println(T1.r);
		T1.disp();

		Tista1 T=(Tista1)T1;
		System.out.println(T.r);		
		T.disp();
		T.uliya();
	}
}