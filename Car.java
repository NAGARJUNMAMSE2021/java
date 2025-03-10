class Car
{
double car_cost;
String car_name;
String car_type;
Car(double a,String b,String c)
{
car_cost=a;
car_name=b;
car_type=c;
return;
}
public static void main(String[]args)
{
Car C1=new Car(20000000.00,"BMW","Diesel");
System.out.println(C1.car_cost);
System.out.println(C1.car_name);
System.out.println(C1.car_type);
}
}
