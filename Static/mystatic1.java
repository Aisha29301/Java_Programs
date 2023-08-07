//static is generally used for memory management
//static can be applied with variable,method,blocks,nest class, etc
//static variable is also called as class variable
//non-static variable is also called as instance variable
//local variables can't be static
//memory of static variables allocated once and shared by all objects of that class
//memory of instance/non-static variable allocated separately for each object of that class

class XYZ{
    int a;//4
    double b;//8
    static short c;//2
    static long d;//8
}
class A{
    public static void main(String[] args) {
        // XYZ ob1 = new XYZ();
        // XYZ ob2 = new XYZ();
        // XYZ ob3 = new XYZ();
    }
}
// here for every object 8+4=12 bytes is allocated  separately and static variable memory i.e. 2+8=10 bytes is allocated at one time or once for every object 