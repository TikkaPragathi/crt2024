abstract class First
{
public abstract void m1();
public abstract void m2();
public abstract void m3();
}
abstract class Second extends First
{
public void m1()
{
System.out.println("m1 abstract method in Second");
}
public void m2()
{
System.out.println("m2 abstract method in Second");
}
}
class Third extends Second
{
public void m3()
{
System.out.println("m3 abstract method in Third");
}
}
class Abs1
{
public static void main(String args[])
{
Third f1=new Third();
f1.m1();
f1.m2();
f1.m3();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Abs1.java
mini@Ts-MacBook-Air JavaCRT1 % java Abs1      
m1 abstract method in Second
m2 abstract method in Second
m3 abstract method in Third


