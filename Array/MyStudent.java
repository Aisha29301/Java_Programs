class Student{
    private int roll;
    private String name;
    private float mks; 

    public void display(){
        System.out.println(roll+"\t"+name+"\t"+mks);
    }
}
class TestStudent{
    public static void main(String[] args) {
        //single object
        // Student ob; //reference
        // ob = new Student();//object


        // int a[] = new int[5];
        Student st[] = new Student[5]; //array of references of Student class
        for(int i=0;i<st.length;i++){
            st[i] = new Student();
        }
        System.out.println("All students are as follows");
        System.out.println("ROLL\tNAME\tMARKS");
        // for(int i=0;i<st.length;i++){
        //     st[i].display();
        // }


        //advance foreach loop
        for(Student t : st)
            t.display();
    }
}