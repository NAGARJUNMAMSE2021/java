class Cola1
{
	int f=10;
}
class Chungacha extends Cola1
{
	int d=100;
}
class Sec
{
	public static void main(String[] args)
	{
		Cola1 C1=new Chungacha();
		System.out.println(C1.f);

		Chungacha C=(Chungacha)C1;
		System.out.println(C.f);
		System.out.println(C.d);
	}
}