class Clothing
{
String cloth_color;
int cloth_cost;
char cloth_size;
Clothing(String a,int b,char c)
{
cloth_color=a;
cloth_cost=b;
cloth_size=c;
return;
}
public static void main(String[]args)
{
Clothing C1=new Clothing("Blue",1200,'L');
System.out.println(C1.cloth_color);
System.out.println(C1.cloth_cost);
System.out.println(C1.cloth_size);
}
}