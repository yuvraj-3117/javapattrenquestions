package javapatternquestioinANDlogicqq;

public class reversenumber {

	public static void main(String[] args) {
		int n =123,r;
		while(n>0)//123>0t so now 12>0 t 1>0t 0>0false
		{
			r=n%10;//120%10=3 12%10=2 1%0=1
			System.out.println(r);//321
			n=n/10;//12 1 0
		}
	}

}
