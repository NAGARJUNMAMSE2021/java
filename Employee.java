class Employee
{
String employee_id;
int salary;
String grade;
Employee(String a,int b,String c)
{
employee_id=a;
salary=b;
grade=c;
return;
}
public static void main(String[]args)
{
Employee E1=new Employee("AASSDFE",45000,"Good");
System.out.println(E1.employee_id);
System.out.println(E1.salary);
System.out.println(E1.grade);
}
}