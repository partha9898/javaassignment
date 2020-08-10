import java.util.Scanner;
public class fib {
	public static void main (String args[])
	{
		int a =0,b=1,c,d,n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the final number for the series");
		n=sc.nextInt();
//		c=a+b;
		//	printf("%d",c);
		for(  i=1;i<=n;i++)
		{
				c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		//	c=a+b;
	}

}
}
