package yadunandan;

public class static_binding {
	int add(int a, int b) {
		return a+b;
	}
	double add(double a,double b,double c) {
		return a+b+c;
			
	}
	public class Static_binding{
	public static void main(String[] args) {
		static_binding a=new static_binding();
		System.out.println(a.add(11,11));
		System.out.println(a.add(11.3,12.6,13.5));
		
		
	}
		
		

	}

}
