import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,m;
n=s.nextInt();
m=s.nextInt();
int a[][]=new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
