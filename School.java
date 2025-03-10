class School
{
String school_name;
char school_grade;
int school_strength;
School(String a,char b,int c)
{
school_name=a;
school_grade=b;
school_strength=c;
return;
}
public static void main(String[]args)
{
School S1=new School("S.N.V.Model HR SEC SCHOOL",'A',1200);
System.out.println(S1.school_name);
System.out.println(S1.school_grade);
System.out.println(S1.school_strength);
}
}