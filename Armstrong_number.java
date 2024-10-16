package karthik_java_project;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in) ;
		System.out.print("enter thr number for Armstrong:");
		int n=s.nextInt();
		int s1=n;
		int rem; // it will get the remainder;
		int arm=0;
		while(n>0) {
			rem=n%10;
			arm+=rem*rem*rem;
			n/=10;
		}
		if(s1==arm) {
    System.out.println(s1+" is a Armstrong");
		}else {
			System.out.println(s1+"\t is not a Armstrong" );
		}
	}

}
