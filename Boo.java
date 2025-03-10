class Demo1
{
double z;
}
class Dumtaka extends Demo1
{
int x;
}
class Boo
{
public static void main(String[]args)
{
Demo1 D1=new Dumtaka();
System.out.println(D1.z);
Dumtaka D=(Dumtaka)D1;
System.out.println(D.x);
}
}
