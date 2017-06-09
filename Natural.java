import java.util.*;
public class Natural
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int i,sum=0;
int n=scan.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=scan.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
