import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private float salary;
    private static int count;
    //Construtor and display -------------------
    public Employee(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        count++;
    }
    public void display(){
        System.out.println(this.id+"\t"+this.name+"\t"+this.salary);
        System.out.println("total count of variables is: "+count);
    }
    //---------------------------------------
}
class TestEmployee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Employees: ");
        int n=sc.nextInt();
        Employee e[] = new Employee[n];//array of references
        int tid;
        String tname;
        float tsal;
        for(int i=0;i<e.length;i++){
            System.out.println("Enter id: ");
            tid=sc.nextInt();
            System.out.println("Enter name:");
            tname=sc.next();
            System.out.println("Enter salary:");
            tsal=sc.nextFloat();
            e[i] = new Employee(tid,tname,tsal);//created object and call paramterized constructor
        }
        System.out.println("All employees details are:");
        System.out.println("ID\tNAME\tSalary");
        for(int i=0;i<n;i++){
           e[i].display();
        }
        
        sc.close();
    }
}