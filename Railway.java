class Railway
{
void train()
{
System.out.println("Ticket");
}
}
class IRCTC
{
static void book(Railway R2)
{
R2.train();
}
}
class Customer
{
public static void main(String[]args)
{
Railway R1=new Railway();
IRCTC.book(R1);
}
}