package javapractice1;
import java.util.Scanner;
public class Num_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the value:");
		num=sc.nextInt();
		int temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
       System.out.println(rev);
  if(rev==temp) {
	  System.out.println(rev+"is palindrom");
  }
  else {
	  System.out.println(rev+"is not palindrom");
  }
	  
  }
}
