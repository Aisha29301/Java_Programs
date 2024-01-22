import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private float salary;
 
    //setters and getters ----------------------------------------
    public void setEmployee(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }
    //------------------------------------------------------------
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
            e[i] = new Employee();//create object
            e[i].setEmployee(tid,tname,tsal);
        }
        System.out.println("All employees details are:");
        System.out.println("ID\tNAME\tSalary");
        for(int i=0;i<n;i++){
            System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary());
        }
    }
}