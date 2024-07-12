import java.util.*;
class Sample
{
int a=45;
static int b=87;
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
class Test6
{
public static void main(String[] args)
{
Sample.display();
Sample s1=new Sample();
s1.show();
s1.display();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test6.java
mini@Ts-MacBook-Air JavaCRT1 % java Test6
Constructor:45 87
Static:45 87
Constructor:45 87
Instance:45 87
Constructor:45 87
Static:45 87