class Cipla
{
void mod()
{
System.out.println("Medicine");
}
}
class Onemg
{
static void order(Cipla C2)
{
C2.mod();
}
}
class Customer6
{
public static void main(String[]args)
{
Cipla C1=new Cipla();
Onemg.order(C1);
}
}