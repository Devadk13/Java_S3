import java.util.*;
class secondlarge
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 int i,j,temp,n,k;
 System.out.println("Enter the no. of elements");
 n=obj.nextInt();
 int a[]=new int[n];
 System.out.println("Enter elements");
 for(i=0;i<n;i++)
 {
   a[i]=obj.nextInt();
 }
 for(j=0;j<n;j++)
 {
   for(k=j+1;k<n;k++)
   {
    if(a[j]>a[k])
    {

     temp=a[j];
     a[j]=a[k];
     a[k]=temp;
    }
   }
 }
 System.out.println("Second largest element ="+a[n-2]);
}

}

