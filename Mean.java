class Sample2
{
	void co()
	{
		System.out.println("Welcome");
	}
}
class Guleyluu extends Sample2
{
	void disp()
	{
		System.out.println("Hello");
	}
}
class Mean
{
	public static void main(String[] args)
	{
		Sample2 S1=new Guleyluu();
		S1.co();

		Guleyluu G=(Guleyluu)S1;
		G.co();
		G.disp();
		
	}
}