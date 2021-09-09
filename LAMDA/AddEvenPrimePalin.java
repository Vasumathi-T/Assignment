package LamdaPgms;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntConsumer;


public class AddEvenPrimePalin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number of TestCases : ");
		int n=sc.nextInt();
		int a=0,b=0;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter The Inputs : ");
		for(int i=0;i<n;i++)
		{

			a=Integer.parseInt(sc.next());
			b=Integer.parseInt(sc.next());
			arr1[i]=a;
			arr2[i]=b;
		}
		for(int i=0;i<n;i++)
		{
			OPP(arr1[i],arr2[i]);
		}

	}

	public static void OPP(int ch,int n)
	{
		IntConsumer bi;
		switch(ch)
		{
		case 1:
			bi=(o)->{
				if(o%2==0)
				{
					System.out.println("EVEN");
				}
				else
				{
					System.out.println("ODD");
				}

			};
			bi.accept(n);
			break;

		case 2:
			bi=(o)->{
				int flag=0;
				if(o==0||o==1)
				{
					System.out.println("PRIME");
				}
				else
				{
					for(int i=2;i<=(o/2);i++)
					{
						if(o%i==0)
						{
							System.out.println("COMPOSITE");
							flag=1;
							break;
						}
					}
				}
				if(flag==0)
				{
					System.out.println("PRIME");
				}

			};
			bi.accept(n);
			break;

		case 3:
			bi=(c)->{
				int c1=c;
				int res=0;

				while(c>0)
				{
					int c2=c%10;
					res=(res*10)+c2;
					c=c/10;
				}

				if(c1==res)
				{
					System.out.println("PALINDROME");
				}
				else
				{
					System.out.println("NOT PALINDROME");
				}
			};
			bi.accept(n);
			break;

		default:
			break;
		}

	}

}
