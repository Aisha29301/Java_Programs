// method must have return datatype, name could be anything
// constructor is a special member whose name is same as class name
// constructor do not have return data type
// constructor is called implicitly at the time of object creation(instantiation)
// general purpose of constructor is used to initalize object
// constructor can be parameterized, parameterized constructor
// method overloading / constructor overloading
// if there are more than one constructor having same name but different no/type of parameters

class MNOP{
    private int x;
    private int y;

    public MNOP(){
        System.out.println("object is created and no-argu constructor called");
        x = 0;
        y = 0;
    }
    public MNOP(int a){
        System.out.println("object is created and one-argu constructor called");
        x = a;
        y = a;
    }
    public MNOP(int a,int b){
        System.out.println("object is created and two-argus constructor called");
        x = a;
        y = b;
    }
    public void display(){
        System.out.println(x+" : "+y);
    }
}

class Test{
    public static void main(String afasf[]){
       MNOP ob1 = new MNOP();
       MNOP ob2 = new MNOP(5);
       MNOP ob3 = new MNOP(10,20);
       ob1.display();
       ob2.display();
       ob3.display();
    }
}