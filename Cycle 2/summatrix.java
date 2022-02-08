import java.util.*;
class summatrix
{
 public static void main(String args[])
 {
  Scanner obj =new Scanner (System.in);
  int i,j,r,c;
int a[][]=new int[20][20];
int b[][]=new int[20][20];

System.out.println("Enter rows and columns");
r=obj.nextInt();
c=obj.nextInt();
System.out.println("Enter elements of 1st matrix");

for(i=0;i<r;i++)
for(j=0;j<c;j++)

a[i][j]=obj.nextInt();
System.out.println("Enter elements of 2nd Matrix");

for(i=0;i<r;i++)

for(j=0;j<r;j++)
b[i][j]=obj.nextInt();
int sum[][]=new int[20][20];

for(i=0;i<r;i++)
for(j=0;j<c;j++)

sum[i][j]=a[i][j]+b[i][j];
System.out.println("Sum is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}

