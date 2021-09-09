package LamdaPgms;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LongestPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.next();
		Consumer c=(o)->
		{
			Palindrome pal=new Palindrome();
			pal.LongestPalindrome((String)o);
		};
		c.accept(str);

	}

}
class Palindrome
{
	public static void printsubstr(String str,int low,int high)
	{
		System.out.print("Longest Palindrome Substring of a Given String is : ");
		for(int i=low;i<high;++i)
		{
			System.out.print(str.charAt(i));
		}
	}
public int LongestPalindrome(String s)
{
	int n=s.length();
	int maxlen=1,start=0;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i;j<s.length();j++)
		{
			int flag=1;
			for(int k=0;k<(j-i+1)/2;k++)
				if(s.charAt(i+k)!=(s.charAt(j-k)))
					flag=0;
					if(flag!=0 && (j-i+1)>maxlen)
					{
						start=i;
						maxlen=j-i+1;
					}
				}
			}
			printsubstr(s,start,start+maxlen-1);
			return maxlen;
	}
	
}
