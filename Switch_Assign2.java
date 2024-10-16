import java.util.Scanner;
public class Switch_Assign2 {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first value:");
        int i=s.nextInt();
        System.out.println("enter the second value:");
        int k=s.nextInt();
        System.out.println("enter the operatiion value:");
        String m =s.next();
        switch (m) {
            case "+":
            System.out.print("addition of two numbers:"+(i+k));
               break; 
            case "-":
            System.out.print("subtraction of two numbers:"+(i-k));
            break;
            case "*":
            System.out.println("multification of two numbers:"+(i*k));
            break;
            case "/":
            System.out.println("division of two numbers:"+(i/k));
            break;
            case "%":
            System.out.println("modulo of two numbers:"+(i%k));
            break;
            default:System.err.println( "invalid input");
               break;
            
        }
s.close();
    }
    
}
