class Finalkey
{
final int a=222;
public static void main(String args[])
{
Finalkey t1=new Finalkey();
System.out.println(t1.a);
//t1.a=224;-->Finalkey.java:8: error: cannot assign a value to final variable a
System.out.println(t1.a);
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Finalkey.java
mini@Ts-MacBook-Air JavaCRT1 % java Finalkey         
222
222
