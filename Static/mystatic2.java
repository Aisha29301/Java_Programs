//static method is also called as class method
//non-static method is also called as instance method
//non-static method is called with instance name and . operator 
//static method is called with class name and . operator 
//static method can only access other static members of the class
//instance method/non-static can access all members of the class
//static method can be called using object name and . operator but generally we can call it by class name.
class ABC{
    int a=21;
    float b=35.25f;
    static int c=51;

    public void m1(){
        System.out.println("i am non-static method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void m2(){
        System.out.println("i am static method");
        System.out.println(c);
        // //error
        // System.out.println(a);
        // System.out.println(b);
    }  
}
class TestABC{
    public static void main(String[] args) {
        ABC ob = new ABC();
        ob.m1();
        ABC.m2();
        //ob.m2(); //possible but not suitable
    }
}
