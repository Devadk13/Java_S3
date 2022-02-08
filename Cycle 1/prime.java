class prime
{
public static void main(String args[])
{
int i,n=23,flag=0;
int m =n/2;

for(i=2;i<=m;i++)
{
if(n%i==0)
{flag=1;
break;

}
}

if(n==0||n==1)
 
System.out.println("is is neither prime nor composite");
else
{
if(flag==0)
System.out.println("Prime");
else
System.out.println("Not prime");
}
}
}






























