import java.util.*;
public class Atm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your name:"+"    ");
		/*
		String  s1=sc.nextLine();
		System.out.print("Please enter your pin:"+"    ");
		String  pin=sc.nextLine();
		if((!s1.matches("[a-zA-Z_]+")) && (!pin.matches("[0-9]+")))
		{
			System.out.println("----->Invalid input...");
		}
		
		*/
		int n=sc.nextInt();
		while(n>10)
		{
			n=n%10;
		}
		System.out.println(n);
	}
	
	
	
	
}