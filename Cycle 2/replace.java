import java.util.*;
class replace
{
 public static void main(String args[])
{
 int i,key;
 int a[]=new int [20];
 Scanner obj =new Scanner(System.in);
 System.out.println("Enter the total no. of elements");
 int n = obj.nextInt();
 System.out.println("Enter the array elements");
 for(i=0;i<n;i++)
 {
   a[i]=obj.nextInt();

 }import java.util.*;
class replace
{
 public static void main(String args[])
{
 int i,key;
 int a[]=new int [20];
 Scanner obj =new Scanner(System.in);
 System.out.println("Enter the total no. of elements");
 int n = obj.nextInt();
 System.out.println("Enter the array elements");
 for(i=0;i<n;i++)
 {
   a[i]=obj.nextInt();

 }
 System.out.println("Enter the element to be replaced");
 key=obj.nextInt();
 System.out.println("Enter the new element: ");
 int elt=obj.nextInt();
 for(i=0;i<n;i++)
 {
   if(a[i]==key)
  {
    a[i]=elt;
  }
 }

 for(i=0;i<n;i++)
 {
  System.out.println("\n"+a[i]);
 }
}

 System.out.println("Enter the element to be replaced");
 key=obj.nextInt();
 System.out.println("Enter the new element: ");
 int elt=obj.nextInt();
 for(i=0;i<n;i++)
 {
   if(a[i]==key)
  {
    a[i]=elt;
  }
 }

 for(i=0;i<n;i++)
 {
  System.out.println("\n"+a[i]);
 }
}
