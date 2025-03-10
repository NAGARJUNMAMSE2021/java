class Vehicle
{
void Bike()
{
System.out.println("Bike Seller");
}
}
class Showroom
{
static void book(Vehicle V2)
{
V2.Bike();
}
}
class Customer9
{
public static void main(String[]args)
{
Vehicle V1=new Vehicle();
Showroom.book(V1);
}
}