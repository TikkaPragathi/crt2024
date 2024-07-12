class Polymorphismstatic
{
void add(int a, int b)
{
System.out.println("Two int arg method");
}
void add(int a, int b,int c)
{
System.out.println("Three int arg method");
}
void add(double a, double b)
{
System.out.println("Two double arg method");
}
public static void main(String args[])
{
Polymorphismstatic t1=new Polymorphismstatic();
t1.add(12,33,55);
t1.add(23.5,56.8);
t1.add(78,22);
}
}
Output:
Three int arg method
Two double arg method
Two int arg method