package javapractice1;
import java.util.Scanner;
public class Add_Or_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.print("Enetr the value :");
 int a = sc.nextInt();
 if(a%2==0) {
	 System.out.println(a+"is even");
 }
 else {
	 System.out.println(a+"is Add");
 }
	}

}
