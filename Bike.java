class Bike
{
int bike_cost;
String bike_brand;
String bike_colour;
Bike(int a,String b,String c)
{
bike_cost=a;
bike_brand=b;
bike_colour=c;
return;
}
public static void main(String[]args)
{
Bike B1=new Bike(1200000,"DUKE","BLUE");
System.out.println(B1.bike_cost);
System.out.println(B1.bike_brand);
System.out.println(B1.bike_colour);
}
}
