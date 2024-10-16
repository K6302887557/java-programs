package karthik_java_project;

import java.util.Scanner;

public class Armstrong_range {
	public static boolean isArmstrong(int n) {
		int arm=0;
		int n1=n;
		int rem;
		int pow=String.valueOf(n).length();
		while(n>0) {
			rem=n%10;
			arm+=Math.pow(rem, pow);
			n/=10;
		}
		return( n1==arm);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the starting number:");
		int i=sc.nextInt();
		System.out.print("enter the number of range:");
		int j=sc.nextInt();
		for(int g=i;g<=j;g++) {
			if(isArmstrong(g)) {
				System.out.println(g);
				//System.out.println(i+" is armstrong");
			}
			//else {
				//System.out.println(i+" is not armstrong");
			//}
		}
}
}
