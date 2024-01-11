import java.util.*;
class SumThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int n=args.length;
        try{
            if(n<1){
                System.out.println("Enter first number: ");
                a = sc.nextInt();
            }else{
                a =Integer.parseInt(args[0]);
            }
            if(n<2){
                System.out.println("Enter Second number: ");
                b = sc.nextInt();
            }else{
                b =Integer.parseInt(args[1]);
            }
            if(n<3){
                System.out.println("Enter Third number: ");
                c = sc.nextInt();
            }else{
                c =Integer.parseInt(args[2]);
            }
            if(n>3){
                int sum =a+b+c;
                System.out.println("Total :"+sum);
                System.out.println("only first 3 digits are consider and ignored else digits");            
            }
            else{
            int sum =a+b+c;
            System.out.println("Total :"+sum);
            }
        }catch(Exception e){
            System.out.println("Enter integers only");
        }
        
    }
}