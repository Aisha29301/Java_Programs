//Array reading and displaying sum and Average

class MyInput1{
	public static void main(String args[]){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		float sum=0;
		System.out.println("Enter size of Array: ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" numbers: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("All  numbers are as follows: ");
		for(int temp : a)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println("Total is: "+sum);
		float avg=sum/n;
		System.out.println("Average is: "+avg);
		sc.close();
	}
}