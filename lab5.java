package day3;

import java.util.Scanner;

public class lab5 {
	int id;
	String name;
	int salary;
	String job;
public lab5(int id, String name, int salary, String job) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.job=job;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("..............Menu chính............");
		System.out.println("1.create employee");
		System.out.println("2.show the existing employee");
		System.out.println("3.exit");
		
		Scanner input0=new Scanner(System.in);
		System.out.println("Input employee: ");
		int m= input0.nextInt();
		System.out.println("Employee: "+m);
		
		do {
			if(m==1) {
			create();
			menu();
			}
			
			if(m==2) {
			show();
			menu();
			}
			
			if(m==0) {
			showmenu();
			}
			
			if(m==3) {
				System.out.println("3.exit");
				menu();
			}
			break;
		
		}
		while(m>=0&&m<4);
	}
public static void create() {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Input id: ");
	int id= input.nextInt();
	System.out.println("ID: "+id);
	
	Scanner input1=new Scanner(System.in);
	System.out.println("Input name: ");
	String name= input1.next();
	System.out.println("Name: "+name);
	
	Scanner input2=new Scanner(System.in);
	System.out.println("Input salary: ");
	int salary= input2.nextInt();
	System.out.println("Salary: "+salary);
	
	Scanner input3=new Scanner(System.in);
	System.out.println("Input Job: ");
	String job= input3.next();
	System.out.println("Job: "+job);
	
	System.out.println("id: "+id+"\nname: "+name+"\nsalary: "+salary+"\njob: "+job);
}
public static void show() {
	Scanner input=new Scanner(System.in);
	System.out.println("Input id: ");
	int id= input.nextInt();
	System.out.println("ID: "+id);
	
	Scanner input1=new Scanner(System.in);
	System.out.println("Input name: ");
	String name= input1.next();
	System.out.println("Name: "+name);
	
	Scanner input2=new Scanner(System.in);
	System.out.println("Input salary: ");
	int salary= input2.nextInt();
	System.out.println("Salary: "+salary);
	
	Scanner input3=new Scanner(System.in);
	System.out.println("Input Job: ");
	String job= input3.next();
	System.out.println("Job: "+job);
	
	lab5 l1 = new lab5(1,"Nguyen van A",1000,"CEO");
	lab5 l2 = new lab5(2,"Nguyen van B",2000,"BA");
	lab5 l3 = new lab5(3,"Nguyen van C",3000,"Tester");
	lab5 l4 = new lab5(4,"Nguyen van D",4000,"Developer");
	lab5 l5 = new lab5(5,"Nguyen van E",5000,"CEO");
	lab5 l6 = new lab5(id,name,salary,job);
	lab5[] lArray = new lab5[6];
	lArray[0]=l1;
	lArray[1]=l2;
	lArray[2]=l3;
	lArray[3]=l4;
	lArray[4]=l5;
	lArray[5]=l6;
	
	int n=6;
	for(int i=0;i<n;i++) {
	System.out.println("Tên là: "+lArray[i].name+"\n ID là: "+lArray[i].id+"\n Tiền lương: "+lArray[i].salary+"\n Công việc: "+lArray[i].job);
	System.out.println("---------------------");
	}
}
	public static void menu() {
		System.out.println("..............Menu chính............");
		System.out.println("1.create em0ployee");
		System.out.println("2.show the existing employee");
		System.out.println("3.exit");
		
		Scanner input0=new Scanner(System.in);
		System.out.println("Input employee: ");
		int m= input0.nextInt();
		System.out.println("Employee: "+m);
	}
	public static void showmenu() {
		System.out.println("..............Menu chính............");
		System.out.println("1.create em0ployee");
		System.out.println("2.show the existing employee");
		System.out.println("3.exit");
	}
}
