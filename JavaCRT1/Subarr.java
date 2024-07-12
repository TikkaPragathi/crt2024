import java.util.*;
class Subarr
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
for(int k=i;k<=j;k++)
{
System.out.print(a[k]+" ");
}
System.out.println();
}
}
}
}
Output
mini@Ts-MacBook-Air JavaCRT1 % java Subarr
4
12 33 51 3 
12 
12 33 
12 33 51 
12 33 51 3 

33 
33 51 
33 51 3 

51 
51 3 

3