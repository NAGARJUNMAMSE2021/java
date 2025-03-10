class Cool2
{
	void disp()
	{
		System.out.println("Java is Programming language");
	}
}
class Dinga extends Cool2
{
	int x=10;
	void tata()
	{
		System.out.println("Python is also Programming language");
	}
}
class Mainclass8
{
	public static void main(String[] args)
	{
		Cool2 C1=new Dinga();
		C1.disp();

		Dinga D=(Dinga)C1;
		D.disp();
		System.out.println(D.x);
		D.tata();
	}
}