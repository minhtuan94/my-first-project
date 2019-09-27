package switchcase;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    byte  m = 0;
		do 
		{
			System.out.println("1. create employee");
			System.out.println("2. show the existing employee");
			System.out.println("3. exit");
			
			Scanner input = new Scanner(System.in);
			System.out.println("nhap so : ");
			
			int n=input.nextInt();
			System.out.println("so ban input : " +n);
		
		switch (n) {
		case 1:
		{
			System.out.println("create employee");
			break;
		}
		case 2:
		{
			System.out.println("show the existing employee");
			break;
		}
		case 3:
		{
			System.out.println("exit");
			break;
		}
		default:
		{
			System.out.println("error");
			break;
		}
		}
		}
		while (m>=0);
		
		}
	}

	
		
