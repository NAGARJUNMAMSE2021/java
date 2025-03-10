class Sample
{
int x;
}
class Ampules extends Sample
{
void ho()
{
System.out.println("Hi");
}
}
class Good
{
public static void main(String[]args)
{
Sample S1=new Ampules();
System.out.println(S1.x);
Ampules A1=(Ampules)S1;
System.out.println(A1.x);
A1.ho();
}
}
