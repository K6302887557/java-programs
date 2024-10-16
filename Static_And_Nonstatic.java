package javapractice1;

public class Static_And_Nonstatic {//static-used to static keyword ex: static int a;
	                               //non-static-we didn't use the static keyword in variable declaration ex: int a;
	static String s;
	 static int age; 
		 static {
			      s = "karthik";
		          age = 21;
		         
		         	}
     int b=0;//this is global variable
     static int a=0; 
	public static void isstatic() {//only access to static identifier
		System.out.println("this is static");	
		  System.out.println(a);
		
		}
	public void isnonstatic() {//it can access static or non-static  variable  what are the declared in  global variables
		System.out.println("this is non static");
		System.out.println(b);
	     	b++; //this is can be increase only non_static methods
	     	    //we can't increase stastic and main mathod without static keyword 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_And_Nonstatic sc= new Static_And_Nonstatic();//object creation for method access.only for non-static methods
		for(int i=0;i<10;i++) {
		isstatic();//directly we can access static method 
		sc.isnonstatic();//we need object creation for access method
	
		a++;//anywhere you can use increment.but only which are used static key
		}
       System.out.println("i am"+" "+s+" "+"age"+ age);
		

	}

}
