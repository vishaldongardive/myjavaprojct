package arrayStudy;

public class MulitiDimentionalArray {

	public static void main(String[] args) {
		//1.array declaration
		int a[][]=new int[2][2];
		//2.assign value
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//3.usage 
		
		System.out.print(a[0][0]+"");
		System.out.println(a[0][1]+"");
		System.out.print(a[1][0]+"");
		System.out.print(a[1][1]);
		System.out.println("========================");
		
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<=1;j++)
			{
		
				System.out.print(a[i][j]+""); //a[0][0],a[0][1][0],a[1][1]
			}
			System.out.println();
			
			
			}
		}

	}


