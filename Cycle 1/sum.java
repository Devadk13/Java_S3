class sum
{
 public static void main(String args[])
{

 int a = 123,sum=0,r=0;
  while(a!=0)
  r=a%10;
  sum=sum+r;
  a=a/10;
 System.out.println("The sum is "+sum);
}
}
