package LamdaPgms;


import java.util.Scanner;
import java.util.function.IntConsumer;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		
		IntConsumer b=((o)->
		{
			if(n%3==0 && n%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(n%3==0)
			{
				System.out.println("Fizz");
			}
			else if(n%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(o);
			}
		});
		b.accept(n);
		

	}

}
