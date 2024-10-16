package javapractice1;

import Oops_javapractice1.Guest;

public class Factorial {
	public void sum() {
		int a=10;
		System.out.println(a);
		sum2(a);
	}
	public void sum2(int a) {
		System.out.println(a+1);
		sum3(a);
	}
	public int sum3(int a) {
		if(a==0)
			return 1;
	
		return a*sum3(a-1);
		
	}
public static void main(String[] args) {
	Factorial g= new Factorial();
	
	System.out.println(g.sum3(5));
	g.sum();
	int n=5,fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}

}
