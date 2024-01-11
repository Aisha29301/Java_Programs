class AddCmd{
    static public void main(String args[]){
        try{
            int a,b;
            int n=args.length;
            System.out.println("START OF MAIN METHOD");
            if(n==2){
                a=Integer.parseInt(args[0]);
                b=Integer.parseInt(args[1]);
                System.out.println("First Argument: "+a);
                System.out.println("Second Argument: "+b);
                System.out.println("Total Argument: "+(a+b));
            }else{
                System.out.println("Enter two paramters");
            }
        }catch(Exception e){
            System.out.println("only integers are allowed");
        }
        System.out.println("END OF MAIN METHOD");
    }
}
