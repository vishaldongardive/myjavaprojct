package variableTypes;

public class GlobalAndLoalVarible {

	public static void main(String[] args) {
		//non-static global variable
		int a=90;//1+2 declaration + assign value
		//static global variable
	}
		static int b=10;//1+2declartion+assign value
		
		public static void Main(String[] args)
		{
			GlobalAndLocalVraible g=new GlobalAndLocalVarible();
			g,test();
		test1();
		System.out.println("global value of a is"+g.a);
		System.out.println("global value of b is"+b);
		int sum =10+g.a;
		int sub=100;
		
		Sample s= new Sample();
		System.out.println("value of non-static global varible from anthor class is"+s.p);
		
		System.out.println("value of non-static global varible from anthoer class is"+Sample.q);

		}
        public void test()
        {
        	int a=80;
        	int sum=a+100;
        	System.out.println("sum is"+sum);
}
        public static void test1()
        {
        	//static int b=800;
        	int a=1000;
        	System.out.println("Running static test1 method");
}



		}

	}

}
