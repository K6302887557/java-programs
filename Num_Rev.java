package karthik_java_project;

import java.util.Scanner;

public class Num_Rev {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.print("enter the values:");
				int n = sc.nextInt();
			   int s=0,r,temp;
			   temp = n;
			   while(n > 0) {
				   r=n%10;
				   s=(s*10)+r;
				   n=n/10;
			   }
			   if(s==temp)
			   {
				   System.out.print("palindrom");
			   }
			   else {
				   System.out.println("not palindrom");
			   }
				

			}

		


	}


