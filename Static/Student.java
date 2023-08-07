class Student {
    private int roll; //individual variable / non-static variable / related to particular instance 
    private float mks;//same as above
    private static int cnt;//common variable / static variable / related to entire class

    public Student(int r,float m){
        roll = r;
        mks = m;
        cnt++;
    }
    public void display(){
        System.out.println("Roll number: "+roll);
        System.out.println("Marks: "+mks);
    }
    public static void show(){
        System.out.println("Number of objects created:"+cnt);
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student st1 = new Student(111,99.00f);
        st1.display();
        Student.show();

        Student st2 = new Student(222,90.00f);
        st2.display();
        Student.show();

        Student st3 = new Student(333,92.00f);
        st3.display();
        Student.show();
    }
}
