class Test3
{
int a=10,b=20;

void show(int a, int b)
{
System.out.println(a+b);
System.out.println(this.a+this.b);
}
public static void main(String args[])
{
Test3 t1=new Test3();
t1.show(100,200);
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test3.java
mini@Ts-MacBook-Air JavaCRT1 % java Test3
300
30