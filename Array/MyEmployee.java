
class Employee{
    private int id;
    private float salary;

    public void setEmployee(int id,float salary){
        this.id = id;
        this.salary =salary;
    }
    public void display(){
        System.out.println(id+"\t"+salary);
    }
}
class TestEmployee{
    public static void main(String[] args) {
        // Employee ob = null; //reference
        // ob = new Employee();//ob is an object/instance
        Employee e[] = new Employee[5]; //array of references of employee class
        int i;
        for(i=0;i<e.length;i++){
            e[i] = new Employee();
        }
        e[0].setEmployee(111,21000.00f);
        e[1].setEmployee(222,41000.00f);
        e[3].setEmployee(333,31000.00f);
        System.out.println("All employees are as follows");
        System.out.println("ID\tSALARY");
        // for(i=0;i<e.length;i++)
        //     e[i].display();
        for(Employee t : e){
            t.display();
        }
        









        // how many objects are created here?
        // array ke 5 objects and whole array as one object total "6" objects we made here (if we also add that single object then 7)
    }
}