class Tours
{
void bus()
{
System.out.println("Bus Transport");
}
}
class Redbus
{
static void book(Tours T2)
{
T2.bus();
}
}
class Customer8
{
public static void main(String[]args)
{
Tours T1=new Tours();
Redbus.book(T1);
}
}