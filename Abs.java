abstract class Parent
{
void m1()
{
System.out.println("m1 method in parent");
}
public abstract void m2();
}
class Child extends Parent
{
void m3()
{
System.out.println("m3 method in child");
}
public void m2()
{
System.out.println("m2  abstract method in child");
}
}
class Abs
{
public static void main(String args[])
{
Child c1=new Child();
c1.m1();
c1.m2();
c1.m3();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Abs.java
mini@Ts-MacBook-Air JavaCRT1 % java Abs      
m1 method in parent
m2  abstract method in child
m3 method in child

