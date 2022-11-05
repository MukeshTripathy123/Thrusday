
package javabasicprogram;
import java.util.Scanner;
public class SumOfAllEvenNumber {
public static void main(String[]args) {
	
int i,n,even=1;
	
Scanner sc=new Scanner(System.in);	
	System.out.println("enter range");
	
	
	n=sc.nextInt();
	
	for(i=1;i<=n; i++)
	{
	even=even+i;//sum+=i;		
System.out.println("Sum of all even number from 1 to "+n+" is: "+even);
}
	
	}
}
	
	
	