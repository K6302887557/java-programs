import java.util.Scanner;
public class Even_Or_Odd{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the the value of n:");
         n=s.nextInt();
        if(n%2==0){
            System.out.println(n+" " +"is even number");
        }
        else{
          System.out.println(n+" "+"is Odd number");
        }
s.close();
    }
}