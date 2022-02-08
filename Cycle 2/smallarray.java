import java.util.*;
class smallarray
{
 public static void main(String args[])
{
 int a[]=new int [20];
 Scanner obj=new Scanner(System.in);
 int i,n,small;
 System.out.println("Enter number of elements:");
 n=obj.nextInt(); 
 for(i=0;i<n;i++)
 {
  System.out.println("Enter Element "+ (i+1));
  a[i]=obj.nextInt();
  
 }
 
 small=a[0];
 for(i=0;i<n;i++)
 {
  if(a[i]<small)
  {
   small=a[i];
  }
 }
System.out.println(small);
}
}

