package demo;

public class tryblock {
	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0); // This line may throw an exception
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }

	    public static int divide(int numerator, int denominator) {
	        return numerator / denominator; // This method may throw an ArithmeticException
	    }
	}
