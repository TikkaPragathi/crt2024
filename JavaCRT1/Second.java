//Same package child class


package pack1;
class Second extends First
{
 void show2()
{
//System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
}
public static void main(String args[])
{
Second s1=new Second();
s1.show2();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac -d . Second.java
mini@Ts-MacBook-Air JavaCRT1 % java pack1.Second
b=200
c=300
d=400
