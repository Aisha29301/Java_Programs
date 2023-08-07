class Employee{
    private int id;
    private float sal;
    private static String company="tcs";

    public Employee(int a, float b){
        id = a;
        sal = b;
    }
    public static void change(){
        company="google";
    }
    public void display(){
        System.out.println("ID: "+id);
        System.out.println("SALARY: "+sal);
        System.out.println("COMPANY: "+company);
    }
}
class Test{
    public static void main(String[] args) {
        Employee e1 = new Employee(111,21000.0f);
        e1.display();

        Employee e2 = new Employee(222,31000.0f);
        e2.display();

        Employee e3 = new Employee(333,51000.0f);
        e3.display();

        Employee.change();
        e1.display();
        e2.display();
        e3.display();
    }
}
