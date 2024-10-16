package javapractice1;
import java.util.Scanner;
public class Prime_Or_Not {
	public static void prime(int n) 
	{
		if(n==0||n==1) 
		{
			System.out.println(n+" is not a prime");
		}else
		{
          int count=0,g;
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0) {
			count++;
			}
		}
		if(count==2) 
		{
			System.out.print("is prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value:");
		int k=sc.nextInt();
		prime(k);
			
		}
		
	}


