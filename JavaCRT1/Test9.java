class Father
{
String fname;
int p1;
void getFather(String fname,int p1)
{
this.fname=fname;
this.p1=p1;
}
void showFather()
{
System.out.println("Father name="+fname);
System.out.println("Father property="+p1);
}
}
class Daughter extends Father
{
String dname;
int p2;
void getDaughter(String dname,int p2)
{
this.dname=dname;
this.p2=p2;
}
void showDaughter()
{
System.out.println("Daughter name="+dname);
System.out.println("Daughter property="+p2);
System.out.println("Daughter total property="+(p1+p2));
}
}
class Test9
{
public static void main(String args[])
{
Daughter d1=new Daughter();
d1.getFather("rrr",200000);
d1.showFather();
d1.getDaughter("ccc",300000);
d1.showDaughter();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test9.java
mini@Ts-MacBook-Air JavaCRT1 % java Test9      
Father name=rrr
Father property=200000
Daughter name=ccc
Daughter property=300000
Daughter total property=500000




