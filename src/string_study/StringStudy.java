package string_study;

public class StringStudy {

	public static void main(String[] args) {
		String s="velocity";
		
		String s1="Velocity";
		String s2="Vel";
		String s3="Test";
		String m= new String("Velocity");
		
		String m1=new String("Velocity");
		String m2=new String("Velocity");
		String m3=new String("");
		String m4=new String("java classes");
		System.out.println(s==s1);
		System.out.println(s==m);
		System.out.println(m1.equals(m));
		
		//use of length method
		System.out.println(s1.length());
		int mylength=s1.length();
		System.out.println(mylength);

	}

}
