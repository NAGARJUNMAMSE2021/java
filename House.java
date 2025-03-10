class House
{
String house_name;
int house_cost;
String house_colour;
House(String a,int b,String c)
{
house_name=a;
house_cost=b;
house_colour=c;
return;
}
public static void main(String[]args)
{
House H1=new House("Varshini House",12000000,"Blue");
System.out.println(H1.house_name);
System.out.println(H1.house_cost);
System.out.println(H1.house_colour);
}
}