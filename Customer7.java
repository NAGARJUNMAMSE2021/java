class IBM
{
void opening()
{
System.out.println("Class");
}
}
class Jspider
{
static void attend(IBM I2)
{
I2.opening();
}
}
class Customer7
{
public static void main(String[]args)
{
IBM I1=new IBM();
Jspider.attend(I1);
}
}