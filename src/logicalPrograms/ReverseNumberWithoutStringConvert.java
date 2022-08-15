package logicalPrograms;

public class ReverseNumberWithoutStringConvert {

	public static void main(String[] args) {
		int number=123;
		int revNum=0;
		for(int i=number;i>0;i=i/10)
		{
			int re=i%10;
			revNum=revNum*10+revNum;
		}
		System.out.println(revNum);
		}

	}


