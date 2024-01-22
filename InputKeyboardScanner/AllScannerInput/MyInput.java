//Scanner class to read different types of datatypes

import java.util.Scanner;
//it tells compiler that scanner class is inside util package
/*
class Scanner{
	public int nextInt();
	public float nextFloat();
	public String next();
	public String nextLine();
	public double nextDouble();
	public boolean nextBoolean();
	public short nextShort();
	public byte nextByte();

}*/
class MyInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a;
		float b;
		String c;
		double d;
		boolean e;
		short f;
		byte g;
		String l;
		
		//System.out.println("Enter a line:");
		//l = sc.nextLine();
		
		System.out.println("Enter a number:");
		a = sc.nextInt();
		
		System.out.println("Enter a floating point number:");
		b = sc.nextFloat();
		
		System.out.println("Enter a String:");
		c = sc.next();
		
		System.out.println("Enter a double number:");
		d = sc.nextDouble();
		
		System.out.println("Enter a boolean value:");
		e = sc.nextBoolean();
		
		System.out.println("Enter a short number:");
		f = sc.nextShort();
		
		System.out.println("Enter a byte number:");
		g = sc.nextByte();
		
		sc.nextLine();
		System.out.println("Enter a line:");
		l = sc.nextLine();
		
		System.out.println("Integer: "+a);
		System.out.println("Floating point: "+b);
		System.out.println("String: "+c);
		System.out.println("Double: "+d);
		System.out.println("Boolean value is: "+e);
		System.out.println("Short: "+f);
		System.out.println("Byte: "+g);
		System.out.println("A line is: "+l);
		sc.close();
	}
}