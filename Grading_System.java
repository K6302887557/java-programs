import java.util.Scanner;
public class Grading_System {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the Student Marks:"+"");
        int m=s.nextInt();
        if(m<35){
            System.out.println("student Fail");
        }
        if(m==35){
            System.out.println("Student Pass");
        }if(m>35&&m<=70){
            System.out.println("Student Pass in third class");
        }if(m>70&&m<=85){
            System.out.println("Student Pass in second class");
        }if(m>85&&m<=100){
            System.out.println("Student Pass in first class");
        }if(m>100){
            System.out.println("invalid number entered");
        }
       s.close();  
    }
}
