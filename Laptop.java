class Laptop
{
	String laptop_name;
	int laptop_cost;
	String laptop_brand;
	Laptop(String a,int b,String c)
	{
		laptop_name=a;
		laptop_cost=b;
		laptop_brand=c;
		return;
	}
	public static void main(String[]args)
	{
		Laptop L1=new Laptop("HP",56999,"ELITEBOOK");
		System.out.println(L1.laptop_name);
		System.out.println(L1.laptop_cost);
		System.out.println(L1.laptop_brand);
	}
}