
class Gfather
{
String gfname;
int p1;
void getGfather(String gfname,int p1)
{
this.gfname=gfname;
this.p1=p1;
}
void showGfather()
{
System.out.println("GFather name="+gfname);
System.out.println("GFather property="+p1);
}
}
class Father extends Gfather
{
String fname;
int p2;
void getFather(String fname,int p2)
{
this.fname=fname;
this.p2=p2;
}
void showFather()
{
System.out.println("Father name="+fname);
System.out.println("Father property="+(p1+p2));
}
}
class Daughter extends Father
{
String dname;
int p3;
void getDaughter(String dname,int p3)
{
this.dname=dname;
this.p3=p3;
}
void showDaughter()
{
System.out.println("Daughter name="+dname);
//System.out.println("Daughter property="+p3);
System.out.println("Daughter total property="+(p1+p2+p3));
}
}
class Test10
{
public static void main(String args[])
{
Daughter d1=new Daughter();
d1.getGfather("rrr",200000);
d1.showGfather();
d1.getFather("ccc",300000);
d1.showFather();
d1.getDaughter("bbb",400000);
d1.showDaughter();
}
}
Output:
mini@Ts-MacBook-Air JavaCRT1 % javac Test10.java
mini@Ts-MacBook-Air JavaCRT1 % java Test10      
GFather name=rrr
GFather property=200000
Father name=ccc
Father property=500000
Daughter name=bbb
Daughter total property=900000

