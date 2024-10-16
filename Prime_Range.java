package karthik_java_project;
import java.util.Scanner;
public class Prime_Range {
	public static void isprime(int g,int k)
	{   
		for(int i=g;i<=k;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
				{
					count= count+1;
				}
			}if(count==2) {
					System.out.print(" "+i+" ");
				}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value:");
		int n= sc.nextInt();
		System.out.print("enter the value:");
		int k=sc.nextInt();
		isprime(n,k);
				
			}
		}


