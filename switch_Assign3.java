import java.util.Scanner;
public class switch_Assign3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the day name:");
        String day=s.nextLine();
        switch(day){
            case "monday":
            System.out.println("uff,it's a weekday");
            break;
            case "tuesday":
            System.out.println("uff,it's a weekday");
            break;
            case "wednesday":
            System.out.println("uff,it's a weekday");
            break;
            case "thursday":
            System.out.println("uff,it's a weekday");
            break;
            case "friday":
            System.out.println("uff,it's a weekday");
            break;
            case "saturday":
            System.out.println("yayy,it's a weekend");
            break;
            case "sunday":
            System.out.println("yayy,it's a weekend");
            break;
            default:
            System.err.println("invalid input");
            break;
        }
        s.close();
    }
    
}
