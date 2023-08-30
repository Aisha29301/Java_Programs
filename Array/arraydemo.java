//array is a collection of similar datatypes
//array is allocated dynamically
//true false => default constant of boolean AND null=> default constant of non-primitive
//there is one attribute 'length' 
//In java, array is itself an object.

class MyArray{
    public static void main(String args[]){ //in main this is Array of Strings
        int a[] = new int[10]; //this is Array of on Integers.
        // int[] b = new int[10];

        float c[] = new float[5];

        // float d[];
        // d = new float[5];

        // double[] dd;
        // dd = new double[7];

        boolean bo[] = new boolean[3];

        String[] s = new String[5];
        // here String is bulit in class

        System.out.println("Array of integers 'a' as follows:");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Array of floats 'c' as follows:");
        for(int j=0;j<5;j++){
            System.out.print(c[j]+" ");
        }
        System.out.println();

        System.out.println("Array of booleans 'bo' as follows:");
        for(int k=0;k<3;k++){
            System.out.print(bo[k]+" ");
        }
        System.out.println();

        System.out.println("Array of Strings 's' as follows:");
        for(int l=0;l<3;l++){
            System.out.print(s[l]+" ");
        }
        System.out.println();




        // System.out.println("Array of integers 'a' as follows:");
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();

        // System.out.println("Array of floats 'c' as follows:");
        // for(int j=0;j<c.length;j++){
        //     System.out.print(c[j]+" ");
        // }
        // System.out.println();

        // System.out.println("Array of booleans 'bo' as follows:");
        // for(int k=0;k<bo.length;k++){
        //     System.out.print(bo[k]+" ");
        // }
        // System.out.println();

        // System.out.println("Array of Strings 's' as follows:");
        // for(int l=0;l<s.length;l++){
        //     System.out.print(s[l]+" ");
        // }
        // System.out.println();




        // int i;
        // int a[] = new int[5];
        // a[0]=11;
        // a[1]=12;
        // a[2]=21;
        // a[3]=31;
        // a[4]=91;

        // // int b[] = {21,34,56,78};

        // boolean[] c = new boolean[]{true,false,true};

        // String s[] = {"aaa","bbb","null","nsg"};

        // System.out.println("Array of integers are follows:");
        // for(i=0;i<a.length;i++)
        //     System.out.print(a[i]+" ");
        // System.out.println();   
        
        // System.out.println("Array of Strings are follows:");
        // for(i=0;i<s.length;i++)
        //     System.out.print(s[i]+" ");
        // System.out.println();
        
        // System.out.println("Array of booleans are follows:");
        // for(i=0;i<c.length;i++)
        //     System.out.print(c[i]+" ");
        // System.out.println();
    }
} 