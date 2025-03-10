class Cool4
{
	void add()
	{
		System.out.println(10+20);
	}
}
class Goolata2 extends Cool4
{
	int r=10;
	void disp()
	{
		System.out.println("Java is Programming language");
	}
}
class Mainclass10
{
	public static void main(String[] args)
	{
		Cool4 C1=new Goolata2();
		C1.add();

		Goolata2 G=(Goolata2)C1;
		System.out.println(G.r);		
		G.disp();
		G.add();
	}
}