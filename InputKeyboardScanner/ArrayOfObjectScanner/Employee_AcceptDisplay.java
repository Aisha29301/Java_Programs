import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private float salary;
    //accept and display------------------------------
    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id=sc.nextInt();
        System.out.println("Enter name:");
        this.name=sc.next();
        System.out.println("Enter salary:");
        this.salary=sc.nextFloat();
        sc.close();
    }
    public void display(){
        System.out.println(this.id+"\t"+this.name+"\t"+this.salary);
    }
    //-----------------------------------------------------
}
class TestEmployee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Employees: ");
        int n=sc.nextInt();
        Employee e[] = new Employee[n];//array of references
        for(int i=0;i<n;i++){
            e[i] = new Employee();//create object
            e[i].accept();
        }
        System.out.println("All employees details are:");
        System.out.println("ID\tNAME\tSalary");
        for(int i=0;i<n;i++){
            e[i].display();
        }
        sc.close();
    }
}