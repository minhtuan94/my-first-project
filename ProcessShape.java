package lab2day4;

import java.util.Scanner;

public class ProcessShape {
	public static double hinhchunhat;
	public static double tamgiac;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input0=new Scanner(System.in);
		System.out.println("Input n: ");
		int n= input0.nextInt();
		
		do {
		if(n==0) {
		getarear();
		}
		if(n==1) {
		getareat();
		}
		break;
		}
		while(n>=0&&n<2);
	}
	public static void getarear() {
		Scanner input=new Scanner(System.in);
		System.out.println("Input Length: ");
		int length= input.nextInt();
		System.out.println("Length: "+length);
		
		Scanner input1=new Scanner(System.in);
		System.out.println("Input Width: ");
		int width= input1.nextInt();
		System.out.println("Length: "+width);
		
		Rectangle r=new Rectangle("red",length,width);
		System.out.println("color of Rectangle is: "+r.color);
		hinhchunhat = r.length*r.width;
		System.out.println("dien tich hinh chu nhat: "+hinhchunhat);
	}
	public static void getareat() {
		Scanner input2=new Scanner(System.in);
		System.out.println("Input base: ");
		int base= input2.nextInt();
		System.out.println("Length: "+base);
		
		Scanner input3=new Scanner(System.in);
		System.out.println("Input height: ");
		int height= input3.nextInt();
		System.out.println("Height: "+height);
		
		
		Triangle t=new Triangle("blue",8,9);
		System.out.println("color of Triangle is: "+t.color);
		tamgiac = 0.5*t.base*t.height;
		System.out.println("dien tich hinh tamgiac: "+tamgiac);
	}
}