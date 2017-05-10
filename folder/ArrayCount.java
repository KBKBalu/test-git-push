import java.util.*;
class ArrayCount
{
 public static void main(String args[])
  {
   int n,x,count=0,i=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number of elements in Array");
   n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter All the elements");
 for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
  System.out.println("Enter the element of which you want to count no of occurances");
  x=sc.nextInt();
 for(i=0;i<n;i++)
  {
    if(a[i]==x)
     {
	count++;
     }
  }
 System.out.println("number of occurances of the element :"+count);
  }
}