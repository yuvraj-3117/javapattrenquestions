package javapatternquestioinANDlogicqq;

public class hollowrombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(int j=1; j<(i-1)*2; j++)
			{
				System.out.print(" ");	
			}
			if(i==1)
			{
				System.out.println();
			}
			else {
				System.out.println("*");
			}
			
			System.out.println();
		}
		
		//second way
		for(int i=4; i>=1; i--)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1; j<(i-1)*2; j++)
			{
				System.out.print(" ");	
			}
			
			if(i==1)
			{
				System.out.println();
			}
			else {
				System.out.println("*");
			}
			
			System.out.println();
		}		}}


