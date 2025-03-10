class Mobile
{
int mobile_cost;
String mobile_model;
String mobile_colour;
Mobile(int a,String b,String c)
{
 mobile_cost=a;
 mobile_model=b;
 mobile_colour=c;
 return;
}
public static void main(String[]args)
{
Mobile M1=new Mobile(100000,"IQNEO7","Black");
System.out.println(M1.mobile_cost);
System.out.println(M1.mobile_model);
System.out.println(M1.mobile_colour);
}
}