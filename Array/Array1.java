//Advanced for loop / foreach loop
class MyArray1{
    public static void main(String[] args) {
        int a[] = new int [5];
        a[0] = 11;
        a[1] = 12;
        a[2] = 21;
        a[3] = 31;
        a[4] = 91;

        String b[] = {"aaa","bbb","null","nsg"};

        boolean[] c = new boolean[]{true,false,true};

        for(int x : a)
            System.out.print(x+" ");
        System.out.println();    

        for(String s : b)
            System.out.print(s+" "); 
        System.out.println();    
        
        for(boolean t : c)
            System.out.print(t+" "); 
        System.out.println();   
    }
}