package test;

import java.util.Scanner;

public class test1boolean {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter boolean values for  a,b,c");
		boolean a=sc.nextBoolean();
//		System.out.println("enter boolean variable");
	boolean b=sc.nextBoolean();
//		System.out.println("enter boolean variable");
	boolean c=sc.nextBoolean();
		if(a==true)
		{
		if((b==true&&c==true)||(b==true&&c==false)||(b==false&&c==true))
			{
				System.out.println(" Success: Atleast two  out of three variable are true");
			}
		else {
			System.out.println("Failed1: Atleast two out of three variable are not true ");
		}
			
		}
		else {
			if(b==true&&c==true)
			{
				System.out.println("Atleast two  out of three Booleans are true");
			}
			else
			{
				System.out.println("Failed: Atleast two out of three variable are not true ");
			}
		}
		
		
	}

}
