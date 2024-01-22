//reading '1' Student data thr Scanner from keyboard

import java.util.*;
class Student{
	private int roll;
	private String name;
	private float mks;
	
	public void readStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number:");
		roll = sc.nextInt();
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter marks:");
		mks = sc.nextFloat();
		sc.close();
	 
	}
	public void printStudent(){
		System.out.println("Roll number:"+roll);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+mks);
	
	}
}

class TestStudent{
	public static void main(String args[]){
		Student st = new Student();
		st.readStudent();
		st.printStudent();
	}
}