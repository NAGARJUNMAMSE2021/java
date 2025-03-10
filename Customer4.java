class KMF
{
void milk()
{
System.out.println("Mome Milk");
}
}
class Nandhini
{
static void shop(KMF K2)
{
K2.milk();
}
}
class Customer4
{
public static void main(String[]args)
{
KMF K1=new KMF();
Nandhini.shop(K1);
}
}