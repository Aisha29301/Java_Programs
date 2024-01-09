// constructor is a special member whose name is same as class name
// constructor do not have return data type
// constructor is called implicitly at the time of object creation(instantiation)
// general purpose of constructor is used to initalize object
// constructor can be parameterized, parameterized constructor
// method overloading / constructor overloading
// if there are more than one constructor having same name but different no/type of parameters
// if there is no any constructor defined in class, then there is one default constructor provided by compiler
// constructor can be private but object can't be created outside class
// constructor can be nested but can't be recursive

class A{
    private A(){
        System.out.println("hello");
    }
    public static void main(String args[]){
        A ob = new A();
    }
}
