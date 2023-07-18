public class logical {
    // logical AND &&
    // logical OR ||
    // logical not !
    public static void main(String[] args) {
        boolean result;
        int a=5;
        int b=2;
        result=(a>b) && (a==b);
        System.out.println(result); //true && false ----->false

        result=(a>b) || (a==b);
        System.out.println(result); //true || false ----->true

        result=!(a>b);
        System.out.println(result); //!true ......>false 

        

    }

}
