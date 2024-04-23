package javapatternquestioinANDlogicqq;

public class fulldaimond {

	public static void main(String[] args)
	{
	
		int i,j,k;
		for(i=1; i<=7; i++)//rows
	//	for( i=7; i>=1;i--)
		{
			for(j=7; j>i; j--)//space
			{
				System.out.print(" ");
              				
			}
			for(k=1; k<=i;k++)//coloms
			{
			 
				System.out.print("* ");
			}
			
			System.out.print("\n");
		}
		
		
		
		for(i=6; i>=1; i--)//rows
		//for( i=1; i<=7;i++)
		{
			for(j=7; j>i; j--)//space
			{
				System.out.print(" ");
              				
			}
			for(k=1; k<=i;k++)//coloms
			{
			System.out.print("* ");	
			} 
			
			System.out.print("\n");
		}
	}
	}



