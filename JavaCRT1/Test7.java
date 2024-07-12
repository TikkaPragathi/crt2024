class Student
{
int admno=111;
String name="sss";

void display()
{
System.out.println("----------------------");
System.out.println("Student Report");
System.out.println("----------------------");
}
}

class Marks
{
int mat=76,phy=85,che=67;
void show()
{
Student s1=new Student();
s1.display();
System.out.println("Admno="+s1.admno);
System.out.println("Name="+s1.name);
System.out.println("Maths="+mat);
System.out.println("Physics="+phy);
System.out.println("Chemistry="+che);
}
}
class Test7
{
public static void main(String args[])
{
Marks m1=new Marks();
m1.show();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test7.java
mini@Ts-MacBook-Air JavaCRT1 % java Test7
----------------------
Student Report
----------------------
Admno=111
Name=sss
Maths=76
Physics=85
Chemistry=67

