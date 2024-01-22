import java.util.Scanner;
class Student3{
    private int rollNo;
    private String name; 
    private float mks;
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(float mks){
        this.mks = mks;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public float getMarks(){
        return this.mks;
    }
    public void display(){
        System.out.println(this.rollNo+"\t"+this.name+"\t"+this.mks);
    }
}
class TestStudent3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many students: ");
        int n=s.nextInt();

        Student3 st[] = new Student3[n];//array of references is created
        int sroll; String sname; float smks;
        System.out.println("Enter "+n+" Students data");
        for(int i=0;i<n;i++){
            System.out.print("Enter Student roll no.: ");
            sroll=s.nextInt();
            System.out.print("Enter Student name: ");
            sname=s.next();
            System.out.print("Enter Student marks: ");
            smks=s.nextFloat();

            st[i] = new Student3();
            st[i].setRollNo(sroll);
            st[i].setName(sname);
            st[i].setMarks(smks);
        }
        System.out.println("ROLLNO\tNAME\tMARKS");
        for(int i=0;i<n;i++){
            System.out.println(st[i].getRollNo()+"\t"+st[i].getName()+"\t"+st[i].getMarks());
        }
        s.close();
    }
}