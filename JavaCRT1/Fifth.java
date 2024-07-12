//Other package no child class

package pack2;
import pack1.First;
class Fifth 
{
void show5()
{
First f1=new First();
//System.out.println("a="+f1.a);
//System.out.println("b="+f1.b);
//System.out.println("c="+f1.c);
System.out.println("d="+f1.d);
}
public static void main(String args[])
{
Fifth f5=new Fifth();
f5.show5();
}
}
Output:

mini@Ts-MacBook-Air JavaCRT1 % touch Fifth.java      
mini@Ts-MacBook-Air JavaCRT1 % java pack2.Fifth
d=400
