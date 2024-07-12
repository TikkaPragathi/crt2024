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
class Marks extends Student
{
int mat=76,phy=85,che=67;
void show()
{
Student s1=new Student();
s1.display();
System.out.println("Admno="+admno);
System.out.println("Name="+name);
System.out.println("Maths="+mat);
System.out.println("Physics="+phy);
System.out.println("Chemistry="+che);
}
}
class Test8
{
public static void main(String args[])
{
Student s1=new Student();
s1.display();
//s1.show();
Marks m1=new Marks();
m1.display();
m1.show();
}
}
Output:
----------------------
Student Report
----------------------
----------------------
Student Report
----------------------
----------------------
Student Report
----------------------
Admno=111
Name=sss
Maths=76
Physics=85
Chemistry=67
