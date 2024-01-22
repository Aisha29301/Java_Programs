//through constructor read data from keyboard using Scanner

import java.util.Scanner;
class Employee1{
	private String name;
	private int id;
	private float salary;
	public Employee1(String name,int id,float salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void display(){
		System.out.println("NAME: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.println("SALARY: "+this.salary);	System.out.println("==========================================");
	}
}
class TestEmployee1{
 	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String ename;
		int eid;
		float esal;
		
		System.out.println("Enter name: ");
		ename=sc.next();
		System.out.println("Enter id:");
		eid=sc.nextInt();
		System.out.println("Enter salary:");
		esal=sc.nextFloat();
		
		Employee1 e1 = new Employee1(ename,eid,esal);
		e1.display();
		
		System.out.println("Enter name: ");
		ename=sc.next();
		System.out.println("Enter id:");
		eid=sc.nextInt();
		System.out.println("Enter salary:");
		esal=sc.nextFloat();
		
		Employee1 e2 = new Employee1(ename,eid,esal);
		e2.display();	
		sc.close();
	}
}