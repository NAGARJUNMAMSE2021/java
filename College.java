class College
{
String course_name;
String university_name;
int exam_cost;
College(String a,String b,int c)
{
String course_name=a;
String university_name=b;
int exam_cost=c;
return;
}
public static void main(String[]args)
{
College C1=new College("BE(CSE)","ANNA UNIVERSITY",2800);
System.out.println(C1.course_name);
System.out.println(C1.university_name);
System.out.println(C1.exam_cost);
}
}