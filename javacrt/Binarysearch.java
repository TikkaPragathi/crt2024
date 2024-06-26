import java.util.*;
class Binarysearch
{
static int binarySearch1(int a[], int low ,int high ,int key)
{
while(low<=high)
{
int mid=(low+high)/2;
if(key==a[mid])
return mid;
else if(key<a[mid])
high=mid-1;
else
low=mid+1;
}
return -1;
}

public static void main(String args[]) 
{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
       int a[]=new int[n];
for (int i=0;i<n;i++) 
{
a[i]=s.nextInt();
}
Arrays.sort(a);
int key=s.nextInt();
int r=binarySearch1(a,0,n-1,key);
if(r==-1)
{
System.out.println("Element is not found");
}
else
{
System.out.println("Element is found"+r);
}
}
}
