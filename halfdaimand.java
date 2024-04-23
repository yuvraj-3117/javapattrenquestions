package javapatternquestioinANDlogicqq;

public class halfdaimand {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1; i<=7; i++)//rows
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


