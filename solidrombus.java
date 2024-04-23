package javapatternquestioinANDlogicqq;
import java.util.Scanner;

public class solidrombus {

	public static void main(String[] args) {
	int i,j,k;
	Scanner sc = new Scanner (System.in);
	System.out.print("enter the numbers of rows for rombus: ");
	int n = sc.nextInt();
	
	for(i=1;i<n;i++)
	{
		for(j=1;j<n-i; j++) 
		{
	
		System.out.print(" ");
	}
	
	for(k=1;k<n;k++) {
		System.out.print("*");
	}
	
System.out.println();
	}



}}
