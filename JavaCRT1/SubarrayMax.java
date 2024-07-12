import java.util.*;
class SubarrayMax
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int max=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
int sum=0;
for(int k=i;k<=j;k++)
{
sum=sum+a[k];
}
if(max<sum)
max=sum;
}
}
System.out.print(max);
}
}
Output:
9 
-2 1 -3 4 -1 2 1 -5 4
6                                                                             
