package javapractice1;
import java.util.Scanner;
public class Reverse_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter the value:");
		String k=s.nextLine();
		//String g=" ";
		//for(int i=6;i>=0;i--) 
	//{
		//g=g+k.charAt(i);//don't consider length of string
			//we can consider index of the string for reverse method// called also string" palindrom"

//	}System.out.print(g);
       String rev= new StringBuilder(k).reverse().toString();
       System.out.println("name reverse:"+rev);
	}

}
