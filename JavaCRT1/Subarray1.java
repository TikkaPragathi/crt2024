import java.util.*;
class Subarray1
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
int sum=s.nextInt();
int i,res;
for(i=0;i<=n-k;i++)
{
res=0;
for(int j=i;j<i+k;j++)
{
res=res+a[j];
}
if(res==sum)
{
System.out.println("Yes");
return;
}
}
if(i==n-k+1)
System.out.println("No ");
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % java Subarray1
9
1 4 2 10 2 3 1 0 20
4
18
Yes
