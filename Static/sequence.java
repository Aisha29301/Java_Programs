//instance variable,static variable
//constructor
//instance method,static method
//init block,static block

/*SEQUENCE:
1)memory allocation for static variable
2)static block
3)main method
4)if we create object
    i)memory allocation for instance variable
    ii)init block
    iii)constructor
*/
class B{
    int x=35; //instance variable
    static int y=21;
    void m1(){
        System.out.println("i am an instance method");
    }
    static void m2(){//static method
        System.out.println("i am a static method");
    }
    B(){
        System.out.println("i am  a constructor");
    }
    {//init-block
        System.out.println(x);
        System.out.println("i am init-block");
    }
    static{//static block
        System.out.println(y);
        System.out.println("i am static block");
    }
    public static void main(String[] args) {
        System.out.println("i am main method");
        B ob = new B();
        ob.m1();
    }
}