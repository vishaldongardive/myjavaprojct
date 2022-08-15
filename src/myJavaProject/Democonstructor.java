package myJavaProject;

public class Democonstructor {
	int a,b,sum;
	
	public void Demo() {
		
		System.out.println("this Demo methods");
	}
    public Democonstructor() {
	
	System.out.println("this is user define constructor");
	a=50;
	b=62;
	sum=a=b;
 System.out.println("a=b"+sum);
}
	public static void main(String[] args) {
	Democonstructor dc = new Democonstructor();
	dc.Demo();
	


	}

}
