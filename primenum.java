package javapatternquestioinANDlogicqq;
import java.util.Scanner;

public class primenum {

public static void main(String[] args) {
	int n,count=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter any number:");//3
 n=sc.nextInt();

for (int i=1; i<=n; i++)  //i=1; 1<=3 condition ture jb tk false value nhi aati tb tk tk loop se hum bahar nhi jaa skte            
{                         //i =2 2<=3 condition true 
	                      //i =3  3<=3 con true
	                     /// i =4 4<=3 cond faalse ab lop se bahar ho jynge or dusr loop m jynge
	
	
	if (n%i==0) { //3%1==0 con true now 3%2==0 noe condi fasle becse reminder 1 now 3%3 ==0 ture                1)3(3 condition true 0 = =0
		count++;//o se 1 se 2                                 
	}                                                           
	
}
if (count==2) //2==2 true
	System.out.println("prime number:");//so 3 is prime number
	else
	System.out.println("not prime number:");
}


}
		

	


