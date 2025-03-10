class Cool
{
int x;
}
class Goolata extends Cool
{
void ho()
{
System.out.println("Hi");
}
}
class Bod
{
public static void main(String[]args)
{
Cool c1=new Goolata();
System.out.println(c1.x);
Goolata g=(Goolata)c1;
System.out.println(g.x);
g.ho();
}
}
