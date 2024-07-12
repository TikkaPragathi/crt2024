class Polymorphismstatic1
{
void add(int a, int b, int c)
{
System.out.println("Three int arg method");
}
void add(float a, float b)
{
System.out.println("Two float arg method");
}
public static void main(String args[])
{
Polymorphismstatic1 t1=new Polymorphismstatic1();
t1.add(12,33,55);
t1.add(23.5f,56.8f);
t1.add(78,22);
t1.add('A','B');
}
}
Output:
Three int arg method
Two float arg method
Two float arg method
Two float arg method
