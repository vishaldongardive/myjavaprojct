package logicalPrograms;

public class ArmStringNumber {

	public static void main(String[] args) {
		int number=153;
		int sum=0;
		for(int i=number;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
			}
		if(number==sum)
		{
			System.out.println("Given number is armstrong number");
			}
		else {
			System.out.println("Given number is not armstrong number");
		}
	}
}
			
		

	


