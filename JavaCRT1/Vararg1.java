class Vararg1
{
void add(int ...a)
{
int r=0;
for(int x:a)
{
r=r+x;
}
System.out.println(r);
}
public static void main(String args[])
{
Vararg1 v1=new Vararg1();
v1.add();
v1.add(23,56);
v1.add(23,56,55,4);
v1.add(34);
}
}
Output:
0
79
138
34

