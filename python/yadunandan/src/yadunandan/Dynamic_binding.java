package yadunandan;

class vechile {
	void run() {
		System.out.println("bike is running");
	}
}
class bike2 extends vechile{
	void run() {
	System.out.println("bike is running safely");
	}
}
public class Dynamic_binding {
	public static void main(String[] args) {
		bike2 ob = new bike2();
		ob.run();
	}
}