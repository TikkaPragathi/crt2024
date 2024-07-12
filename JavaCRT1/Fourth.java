//Other package child class


package pack2;
import pack1.First;
class Fourth extends First
{
void show4()
{
//System.out.println("a="+a);
//System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
}
public static void main(String args[])
{
Fourth f4=new Fourth();
f4.show4();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac -d . Fourth.java
mini@Ts-MacBook-Air JavaCRT1 % java pack2.Fourth
c=300
d=400
