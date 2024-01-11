import java.lang.*;
class FactCmd{
    public static void main(String arr[]){
        int n=arr.length;
        if(n==1){
            try{
                int temp = Integer.parseInt(arr[0]);
                if(temp>=0){
                    int no = Integer.parseInt(arr[0]);
                    int f = 1;
                    for(int i=1;i<=no;i++)
                        f = f * i;
                    System.out.println("Factorial of "+no+" is: "+f);
                }else{
                System.out.println("Enter positive number");
            }
            }catch(Exception e){
                System.out.println("Enter only integers");
            }
            
        }else{
            System.out.println("Enter one paramter");
        }
    }
}