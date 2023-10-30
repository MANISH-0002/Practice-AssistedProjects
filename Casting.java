package demo;

public class Casting {

	public static void main(String[] args) {
		// implicit type casting
		int a=10;
		long b=a;
		float c=b;
		double d=c;
		System.out.println("Implicit Type Csting");
		System.out.println("Before implicit type casting the value is :"+a);
		System.out.println("After implicit type casting the value is :"+b);
		System.out.println("After implicit type casting the value is :"+c);
		System.out.println("After implict type casting the value is :"+d);
		
		//explicit type casting
		double m=4.755d;
		int n=(int)m;
		System.out.println("Explicit Type Csting");
		System.out.println("Before explicit type casting the value is :"+m);
		System.out.println("After explcit type casting the value is :"+n);
		
	}

}
