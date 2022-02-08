class fibonacci
{
 public static void main(String args[])
{
  int n=5,f=0,s=1,sum,i;
  System.out.println(f+"\n"+s);
  for(i=3;i<=n;i++)
  { 
    sum=f+s;
    System.out.println(sum);
    f=s;
    s=sum;
  }
}
}
