package javapractice1;

import java.util.Scanner;

public class Calculator {
	public int add(int a,int b) {
		
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition\n2.Substaction\n3.Multiplication\n4.Division");
		int status=0;
		while(true) {
		System.out.println("enter the first value:");
		int a=sc.nextInt();
		System.out.println("enter the second value:");
		int b=sc.nextInt();
		System.out.println("enter your choice:");
		int n=sc.nextInt();
		
		Calculator s=new Calculator();
		if(n==1) {
		System.out.println(s.add(a, b));
		}
		else if(n==2) {
		System.out.println( s.sub(a, b));
		}
		else if(n==3) {
			System.out.println(s.mul(a, b));
		}else if(n==4) {
			System.out.println(s.div(a, b));
		}
		else {
			System.out.println("enter valid choice ");
			System.exit(status);
			sc.close();
				}
	}
	}
}
