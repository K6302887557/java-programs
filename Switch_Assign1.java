import java.util.Scanner;
public class Switch_Assign1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=s.nextInt();
    switch(n%2){
        case 0:
        {
         System.out.println("it is even number");
        break;
    }
        case 1:
        {
        System.out.println("it is odd number");
        break;
        }
        default:
        {
            System.err.println(" invalid number");
        }
    }
        
s.close();
    }
}
