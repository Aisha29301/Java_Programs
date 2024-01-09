//method must have return datatype, name could be anything
// constructor is a special member whose name is same as class name
// constructor do not have return data type
// constructor is called implicitly at the time of object creation(instantiation)

class ABC{
   public void m1(){
       //block-1 it is a method no error
       System.out.println("i am a method m1");
   }
   public void ABC(){
       //block-2 it is a method no error, method name could be anything
        System.out.println("i am a method ABC");
   }
   public ABC(){
       //block-3 it is a constructor
       System.out.println("i am a constructor ");
   }   
}
class MainABC{
    public static void main(String afsdf[]){
        ABC ob = new ABC();// implicit call to constructor
        ob.m1();  //explicit call to method
    }
}