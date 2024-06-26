//import java.util.*;
class Test
{
public static int fun(int n)
{
int c=0;
for(int i=0;i<n;i++)
{
c++;
}
return c;
}
public static void main(String []args)
{
int n=100;
System.out.println("N=100,no of instructions O(n):"+fun(n));
}
}