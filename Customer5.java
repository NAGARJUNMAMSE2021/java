class Flipkart
{
void pro()
{
System.out.println("Order Product");
}
}
class Ekart
{
static void order(Flipkart F2)
{
F2.pro();
}
}
class Customer5
{
public static void main(String[]args)
{
Flipkart F1=new Flipkart();
Ekart.order(F1);
}
}