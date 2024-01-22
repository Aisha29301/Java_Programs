//through setters and getters read data from keyboard using Scanner

import java.util.Scanner;
class Employee{
	private int id;
	private float salary;
	
	public void setId(int id){
		this.id = id;
	}
	public void setSalary(float salary){
		this.salary = salary;
	}
	
	public int getId(){ 
		return this.id;
	}
	public float getSalary(){
		return this.salary;
	}
	
}
class TestEmployee{
	public static void main(String args[]){
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		int eid;
		float esal;
		System.out.println("Enter id: ");
		eid=sc.nextInt();
		System.out.println("Enter salary: ");
		esal=sc.nextFloat();
		
		e.setId(eid);
		e.setSalary(esal);
		
		System.out.println("ID: "+e.getId());
		System.out.println("SALARY: "+e.getSalary());
		sc.close();
	}
}