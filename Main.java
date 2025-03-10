class Demo
{
int x;
}
class Pemocha extends Demo
{
void ho()
{
System.out.println("Hi");
}
}
class Main
{
public static void main(String[]args)
{
Demo D1=new Pemocha();
System.out.println(D1.x);
Pemocha p=(Pemocha)D1;
System.out.println(p.x);
p.ho();
}
}
