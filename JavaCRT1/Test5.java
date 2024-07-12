import java.util.*;
class Student
{
int a=45;
static int b=47;
void show()
{
System.out.println("Instance:"+a+" "+b);
}
Sample()
{
System.out.println("Constructor:"+a+" "+b);
}
static void display()
{
Sample t=new Sample();
System.out.println("Static:"+t.a+" "+b);
}
}
class Test5
{
public static void main(String args[])
{
Sample.display();
Sample s1=new Sample();
s1.show();
s1.display();
}
}