class Father
{
void surName()
{
System.out.println("T");
}
void designation()
{
System.out.println("Student");
}
}
class Child extends Father
{
void getName()
{
System.out.print("Pragathi");
}
void designation()
{
System.out.println("Java Programmer");
}
}
class Dynamic
{
public static void main(String args[])
{
Child c1=new Child();
c1.getName();
c1.surName();
c1.designation();
}
}                             
                              
Output:
PragathiT
Java Programmer
