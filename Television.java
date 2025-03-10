class Television
{
int tv_cost;
String tv_brand;
String tv_type;
Television(int a,String b,String c)
{
tv_cost=a;
tv_type=b;
tv_type=c;
return;
}
public static void main(String[]args)
{
Television T1=new Television(120000,"Panasonic","OLED");
System.out.println(T1.tv_cost);
System.out.println(T1.tv_brand);
System.out.println(T1.tv_type);
}
}