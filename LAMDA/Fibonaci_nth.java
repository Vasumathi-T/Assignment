package LamdaPgms;

import java.util.Scanner;
import java.util.function.IntConsumer;

public abstract class Fibonaci_nth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		
		IntConsumer bi=(o)->{
			FibSeries(o);
			System.out.println("\nElement of The Fibonacci Sequence is : "+nthFib(o));
			};
		bi.accept(n);

	}

	private static void FibSeries(int o) {
		int a=0;
		int b=1;
		int i=0;
		System.out.print("Fibonacci Series : ");
		while(i<=o)
		{
			if(i==o)
				System.out.print(a);
			else
				System.out.print(a+ "  ");
			
			int sum=a+b;
			a=b;
			b=sum;
			i++;
		}
	}
	
	private static int nthFib(int o)
	{
		if(o<=1)
		{
			return o;
		}
		return nthFib(o-1)+nthFib(o-2);
		

	}

}
