class Sample
{
int a,b;
void get(int a,int b)
{
this.a=a;
this.b=b;
}
void show()
{
System.out.println("a="+a+"b="+b);
}
}
class Addition extends Sample
{
void total()
{
System.out.println("Addition="+(a+b));
}
}
class Product extends Sample
{
void multiply()
{
System.out.println("Product="+(a*b));
}
}
class Test11
{
public static void main(String args[])
{
Addition a1=new Addition();
a1.get(234,764);
a1.show();
a1.total();
Product p1=new Product();
p1.get(23,64);
p1.show();
p1.multiply();
}
}
Output:
a=234b=764
Addition=998
a=23b=64
Product=1472


