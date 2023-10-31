package demo;

public class AccessModifier {

	public int publicvar = 10;
	private int privatevar = 20;
	protected int protectedvar = 30;
    int defaultvar = 40;

	public void publicMethod() {
		System.out.println("This is a public method");
	}

	private void privateMethod() {
		System.out.println("This is a private method");
	}

	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}

	void defaultmethod() {
		System.out.println("This is a default method");
	}

	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		System.out.println("Public Variable:" + obj.publicvar);
		System.out.println("Private Variable:" + obj.privatevar);
		System.out.println("Protected Variable:" + obj.protectedvar);
		System.out.println("Default Variable:" + obj.defaultvar);
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultmethod();
	}

}
