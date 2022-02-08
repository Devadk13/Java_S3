import java.util.*;
class transpose
{
 public static void main(String args[])
{
 Scanner obj= new Scanner(System.in);
 int i,j,r,c;
 System.out.println("Enter no of rows and columns");
 r=obj.nextInt();
 c=obj.nextInt();
 int original[][]=new int [20][20];
 int transpose[][]=new int[20][20];
 System.out.println("Enter elements");
 for(i=0;i<r;i+=)
 {
  for(j=0;j<c;j++)
  {
   original[i][j]=obj.nextInt();
  }
 }
 for(i=0;i<r;i++)
 {
  for(j=0;j<c;j++)
 {
  transpose[i][j]=original[j][i];
 
 
