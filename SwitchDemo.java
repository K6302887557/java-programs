package javapractice1;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the value:");
		String day=s.nextLine();
		switch(day) {
		case "monday":
			System.out.println("monday");
			break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case "thursday":
			System.out.println("thursday");
			default:
				System.out.println("no choice");
		}

	}

}
