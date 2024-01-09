//method must have return datatype, name could be anything
// constructor is a special member whose name is same as class name
// constructor do not have return data type
// constructor is called implicitly at the time of object creation(instantiation)
// general purpose of constructor is used to initalize object
// constructor can be parameterized, parameterized constructor

class Employee{
    private int id; //instance variable
    private float sal;//instance variable

    //parameterized constructor
    public Employee(int a,float b){//constructor same as class name, no return datatype
        id = a;
        sal = b;
    }
    public void display(){//method
        System.out.println("ID : "+id);
        System.out.println("SALARY : "+sal);
    }
}
class TestEmployeee{
    public static void main(String afd[]){
        Employee e1 = new Employee(111,21000.00f);
        Employee e2 = new Employee(222,35000.00f);
        e1.display();
        e2.display();
    }
}




