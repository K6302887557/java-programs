package javapractice1;
import java.util.Scanner;
public class String_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the string:");
		String k= s.next();
		String g="";
		for(int i=k.length()-1;i>=0;i--) 
		{
			g=g+k.charAt(i);
		}
		System.out.println(g);
		if(k.equals(g))// we can use also" k.equalsIgnoreCase(g)"method for check palindrom
		{
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
