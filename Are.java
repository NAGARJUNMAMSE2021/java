class Sample2
{
void co()
{
System.out.println("Vanakkam daa mapla");
}
}
class Guleyluu extends Sample2
{
void disp()
{
System.out.println("Vanakkam daa Pulla");
}
}
class Are
{
public static void main(String[]args)
{
Sample2 S1=new Guleyluu();
Guleyluu G=(Guleyluu)S1;
}
}
