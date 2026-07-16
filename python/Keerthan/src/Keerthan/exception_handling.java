package Keerthan;

public class exception_handling {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic error occurs");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds error occurs");
		}
		finally {
			System.out.println("finally block is always execute");
		}
		System.out.println("Rest of code");
	}

}
