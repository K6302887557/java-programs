package karthik_java_project;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String args[]) 
	{
int n,flag=0;
Scanner a=new Scanner(System.in);
System.out.print("enter the value:");
n=a.nextInt();
if(n<=1) {
	System.out.println("please enter valid number");
}
else {
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			flag++;
		}
	}

if(flag==2) {
	System.out.println(n+" is prime");
}
else {
	System.out.println(n+" is not a prime");
}
	}
	}
}
