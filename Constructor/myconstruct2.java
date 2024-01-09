//method must have return datatype, name could be anything
// constructor is a special member whose name is same as class name
// constructor do not have return data type
// constructor is called implicitly at the time of object creation(instantiation)
// general purpose of constructor is used to initalize object
class Student{
    //instance variables
    private int roll;
    private String name;
    private float mks;
    private boolean x;

    Student(){ // no-argument constructor/default constructor
        System.out.println("object is created");
        roll = 1;
        name = "aaa";
        mks = 50.00f;
        x = true;
    }
    public void display(){
        System.out.println("roll number is "+roll);
        System.out.println("name is "+name);
        System.out.println("marks is "+mks);
        System.out.println("boolean value is "+x);
    }
}

class MainStudent{
    public static void main(String args[]){
        Student st = new Student();
        st.display();
    }
}


