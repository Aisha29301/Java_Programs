// constructor is a special member whose name is same as class name
// constructor do not have return data type
// constructor is called implicitly at the time of object creation(instantiation)
// general purpose of constructor is used to initalize object
// constructor can be parameterized, parameterized constructor
// method overloading / constructor overloading
// if there are more than one constructor having same name but different no/type of parameters
// if there is no any constructor defined in class, then there is one default constructor provided by compiler

class XYZ{
    public XYZ(){
        
    }
    public XYZ(int a){
        System.out.println("1 argument constructor");
    }       
    public XYZ(int a,int b){
        System.out.println("2 arguments constructor");
    }
}
class TestXYZ{
    public static void main(String args[]){
        XYZ ob1 = new XYZ();
        XYZ ob2 = new XYZ(5);
        XYZ ob3 = new XYZ(5,2);
    }
}

