class Tester
{
int x;
}
class Tista extends Tester
{
void ho()
{
System.out.println("Hi");
}
}
class Bad
{
public static void main(String[]args)
{
Tester t1=new Tista();
System.out.println(t1.x);
Tista t=(Tista)t1;
System.out.println(t.x);
t.ho();
}
}
