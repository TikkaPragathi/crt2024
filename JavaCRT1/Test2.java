class Sample
{
void m1()
{
System.out.println("Instance method");
}
}
class Test2
{
public static void main(String args[])
{
Sample s1=new Sample();
s1.m1();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test2.java
mini@Ts-MacBook-Air JavaCRT1 % java Test2      
Instance method

