import java.util.*;
public class Rev
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b,r,sum=0,i;
a=b;
while(a>0)
{
r=a%10;
sum=(sum*10)+r;
a=a/10;
}
if(b%10!=0)
{
System.out.print(sum);
}
else
{
for(i=0;b%10==0;i++)
{
b=b/10;
System.out.print("0");
}
System.out.print(sum);
}
}
}
