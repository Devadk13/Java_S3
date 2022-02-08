class palindrome
{ 
public static void main(String args[])
{

int num=3223, rev=0, rem;
int onum=num;
while(num!=0)
{
 rem=num%10;
 rev=rev*10+rem;
 num=num/10;
}

if(onum==rev)
 System.out.println("Palindrome");
else
 System.out.println("Not Palindrome");
}
}
