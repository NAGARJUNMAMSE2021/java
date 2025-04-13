class Vowel
{
public static void main(String[]args)
{
String str="java is a programming language";
String[]s1=str.split("");
String s2=s1.replaceAll("[aeiouAEIOU]","");
for(int i=0;i<s2.length;i++)
{
reverse(s2[i]);
}
}
public static void reverse(String str)
{
String result="";
for(int i=0;i<s2.length();i++)
{
result=s2.charAt[i]+result;
}
System.out.println(result);
}
}
