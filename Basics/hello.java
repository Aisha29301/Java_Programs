class student{
    private int roll; //instance variable
    private String name; //instance variable

    public void setstudent(){ //method
        roll=111;
        name="abcd";
    }
    public void displaystudent(){
        System.out.println("Roll nunber: "+roll);
        System.out.println("Name is: "+name);
    }
}
class Test{
    public static void main(String args[])
    {
        student st=new student();
        st.setstudent();
        st.displaystudent(); 
    }
}