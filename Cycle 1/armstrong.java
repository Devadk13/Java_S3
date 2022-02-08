class armstrong
{
public static void main(String args[])
{
int num=153, rem,sum=0;
int number;
number=num;
while(num!=0)
{
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(sum==number)
{
System.out.println("Armstrong");
}
else
System.out.println("not Armstrong");

}
}
