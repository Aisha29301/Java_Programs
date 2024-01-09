//this() is used to call constructor explicitly
//this() must be first statement in the constructor
//constructor can be nested but can't be recursive

class A{
    A(){         
        System.out.println("no-argu constructor");
    }
    A(int a){
        //this(21);//error because recursive calling
        System.out.println("parameterized constructor "+a);
    }  
}
class B{
    public static void main(String args[]){
        A ob = new A(5);
    }
}