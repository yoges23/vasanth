import java.util.*;
import java.lang.*;
public class Int 
{
public static void main(String[] args) 
	{
	    Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i,sum=1;
		int[] a=new int[n];
		for(i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
