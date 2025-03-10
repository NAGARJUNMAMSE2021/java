class Demo10
{
	double z=20.3234;
	int r=10;
}
class Dumaka3 extends Demo10
{
	int x=10;
}
class Mainclass11
{
	public static void main(String[] args)
	{
		Demo10 D1=new Dumaka3();
		System.out.println(D1.z);
		System.out.println(D1.r);

		Dumaka3 D=(Dumaka3)D1;
		System.out.println(D.z);
		System.out.println(D.r);
		System.out.println(D.x);		

	}
}