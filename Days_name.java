import java.util.Scanner;
public class Days_name {
    public static void main(String[] args) {
        String day;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name of day:");
        day=s.nextLine();
        if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday"))
        {
        System.out.println("uff,it's a weekdays");
        }
    if (day.equals("sunday") ||  day.equals("saturday"))
      {
        System.out.println("yayy,it's a weekend");
      }  
      s.close();
    }
    
}
