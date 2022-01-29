import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr= new Scanner (System.in);
		System.out.println("Enter the first number");
		int a= scr.nextInt();
		System.out.println("Enter the second number");
		int b= scr.nextInt();
		System.out.println("Enter the third number");	
		int c=scr.nextInt();
		
			if(a>b&&a>c) {
				System.out.println("The Greater Number is");
				System.out.println(a);
			}
			
				if (b>a&&b>c)
				{
					System.out.println("The Greater Number is");
					System.out.println(b);
				}
				if(c>a&&c>b)
				{
					System.out.println("The Greater Number is");
					System.out.println(c);}

	}

}
