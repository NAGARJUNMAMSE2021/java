class Sample21
{
	void col()
	{
		System.out.println("Java is Programming language");
	}
	int r=10;
}
class Hahoha extends Sample21
{
	void disp()
	{
		System.out.println("Python is also Programming language");
	}
}
class Mainclass12
{
	public static void main(String[] args)
	{
		Sample21 S1=new Hahoha();
		System.out.println(S1.r);
		S1.col();

		Hahoha H=(Hahoha)S1;
		System.out.println(H.r);		
		H.col();
		H.disp();
	}
}