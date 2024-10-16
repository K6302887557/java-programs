package javapractice1;

public class PrimeOrNot {
 static void isprime(int n) {
	 boolean flag=false;
	 for(int i=2;i<n/2;i++) {
		 if(n%i==0) {
			 flag=true;
		 }
	 }
	 if(!flag) {
		 System.out.println(n+"is prime");
	 }
	 else {
		 System.out.println(n+"is not prime");
	 }
	 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  isprime(6);
  isprime(97);
  isprime(80);
  isprime(57);
  isprime(75);
	}
	

}
