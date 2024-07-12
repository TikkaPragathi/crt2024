import java.util.*;
class Vararg
{
void show(int ...a)
{
System.out.println("var-arg method"+Arrays.toString(a));
}
public static void main(String args[])
{
Vararg v1=new Vararg();
v1.show();
v1.show(23,56);
v1.show(23,56,55,4);
}
}
Output:
var-arg method[]
var-arg method[23, 56]
var-arg method[23, 56, 55, 4]
