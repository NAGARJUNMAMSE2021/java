class Cola13
{
	int f=10;
	void disp()
	{
		System.out.println("Java is Programming language");
	}
}
class Chungacha extends Cola13
{
	int d=73;
}
class Mainclass13
{
	public static void main(String[] args)
	{
		Cola13 C1=new Chungacha();
		System.out.println(C1.f);
		C1.disp();

		Chungacha C=(Chungacha)C1;
		System.out.println(C.f);		
		C.disp();
		System.out.println(C.d);
	}
}