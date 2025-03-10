class Tester1
{
	int x=10;
	void disp()
	{
		System.out.println("Java is Programming language");
	}
}
class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("Python is also Programming language");
	}
}
class Mainclass7
{
	public static void main(String[] args)
	{
		Tester1 T1=new Huliyacha();
		System.out.println(T1.x);
		T1.disp();

		Huliyacha H=(Huliyacha)T1;
		System.out.println(H.x);
		H.disp();
		H.ho();
	}
}