package Loops;

import java.util.Scanner;

import test.forLoop;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       
		System.out.println("Input any numbers :");
		Scanner pr = new Scanner(System.in);
		int prime = pr.nextInt();
		
		int ans=0;
		
		for(int i=2;i<prime;i++)
		{
			if(prime%i==0)
			{
				ans=1;
				break;
			}
			
		}
			
		if (ans==0)
		      System.out.println(prime + " is a prime number.");
		    else
		     System.out.println(prime + " is not a prime number.");
		
			
	}
}
