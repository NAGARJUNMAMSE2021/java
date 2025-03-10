class Swathihotel
{
void food()
{
System.out.println("Some food");
}
}
class Swiggy
{
static void order(Swathihotel S2)
{
S2.food();
}
}
class Customer3
{
public static void main(String[]args)
{
Swathihotel S1=new Swathihotel();
Swiggy.order(S1);
}
}