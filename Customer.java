class Amazon
{
void product()
{
System.out.println("Some product");
}
}
class Ekart
{
static void shipping(Amazon a2)
{
a2.product();
}
}
class Customer
{
public static void main(String[]args)
{
Amazon a1=new Amazon();
Ekart.shipping(a1);
}
}