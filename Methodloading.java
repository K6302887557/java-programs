package karthik_java_project;

public class Methodloading 
{
	public void test()
	{
		System.out.println("hello");
	}
	public int test(int a,int b)
	{
		return(a+b);
	}
	public float test(int a, float b) {
		return(a+b);
	}
	public float test(float a,float b) {
		return(a+b);
	}
	public static void main(String args[])
	{
		Methodloading k= new Methodloading();
		k.test();
		System.out.println(k.test(10,20));
		
	}
	

}
