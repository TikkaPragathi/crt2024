class Student
{
int admno;
String name;

Student(int x,String y)
{
admno=x;
name=y;
}

void show()
{
System.out.println(admno+" "+name);
}
}
class Test
{
public static void main(String args[])
{
Student s1=new Student(111,"aaa");
s1.show();
Student s2=new Student(222,"ppp");
s2.show();
}
}

Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test.java
mini@Ts-MacBook-Air JavaCRT1 % java Test
111 aaa
222 ppp