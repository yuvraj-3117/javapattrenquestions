package javapatternquestioinANDlogicqq;

public class squrepattrn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=5; i++)//rows 
		{
		for(j=1;j<=5; j++)//coloums
		{
			if(i==1|| i==5|| j==1 || j==5)
				System.out.print("*");
			else
				System.out.print(" ");
			}
					
		System.out.print("\n");
			}
		}}
