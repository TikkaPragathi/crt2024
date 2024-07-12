import java.util.*;
class Product
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();

int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int k=s.nextInt();
int i,res;
for( i=0;i<n;i++)
{
res=1;
for(int j=i;j<n;j++)
{
res=res*a[j];
if(res==k)
{
System.out.println("Yes");
return;
}
}
}
if(i==n)
System.out.println("No ");
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Product.java
mini@Ts-MacBook-Air JavaCRT1 % java Product
5
3 1 -2 -4 5
40

