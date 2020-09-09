package first_one;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side one");
		int side_1 = sc.nextInt();
		
		System.out.println("Enter side one");
		int side_2 = sc.nextInt();
		
		System.out.println("Enter side one");
		int side_3 = sc.nextInt();
		
		if(isTriangle(side_1,side_2,side_3))
			
		{
			System.out.println("This is Triangle");
		}
		else
		{
			System.out.println("This is not");
		}
		
		sc.close();
		
		
	}
	
	public static boolean isTriangle(double a, double b, double c)
	{
		if((a + b > c) &&
			(a + c > b) &&
			(b + c > a))
			{
			return true;
			}
		return false;
	}

}
