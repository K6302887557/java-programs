package javapractice1;

import java.util.Scanner;

public class Demo {
/**
 * @param args
 */
public static void main(String args[]) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	
	System.out.print("enter the value of a:");// using println it will be take new line to reading values
	a=sc.nextInt();
	 
    System.out.print("enter the value of b:");
    b=sc.nextInt();
    
    System.out.print("enter the value of c:");
    c=sc.nextInt();
	
	
	if((a>b)&&(a>c)) {
		System.out.println("a is bigger");
	}
	else if(b>c) {
		System.out.println("b is bigger");
	}
	else
	{
		System.out.println("c is bigger");
	}
}
}

