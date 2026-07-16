package nithya;
class stu{
	int roll;
	void read(int r) {
		roll=r;
	}
}
class students extends stu{
	String name;
	void readname(String n) {
		name=n;
	}
}
class studetails extends students{
	String col;
	void readcol(String c) {
		col=c;
	}


void display() {
	System.out.println("student roll num is="+roll);
	System.out.println("name of the student="+name);
	System.out.println("name of the clg="+col);
}
public class Multi_level_inheritance {

	public static void main(String[] args) {
		studetails s=new studetails();
		s.read(1);
		s.readname("nithya");
		s.readcol("JSSPN");
		s.display();
	}
}
}
		

	

