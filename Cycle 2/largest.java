import java.util.*;
class large
{
public static void main(String args[])
{
 Scanner obj=new Scanner(System.in);
 int i,j,r,c,large;
 int a[][]=new int[n][]
 System.out.println("Enter the no. of rows and columns");
 r=obj.nextInt();
 c=obj.nextInt();
 System.out.println("Enter elements");
 for(i=0;i<r;i++)
 { 
   for(j=0;j<c;j++)
   {
   a[i][j]=obj.nextInt();
   }
 }
 large=a[0][0];
 for(j=0;i<r;j++)
 {
  for(j=0;j<c;j++)
  {
    if(large<a[i][j])
    large=a[i][j];     
  }
 }
 System.out.println("Second largest element ="+ large);

}
}
