import java.util.Scanner;
class Student{
    private int rollNo;
    private String name;
    private float mks;
    Scanner s = new Scanner(System.in);
    public void accept(){
        
        System.out.print("Enter Student roll no.: ");
        this.rollNo=s.nextInt();
        System.out.print("Enter Student name: ");
        this.name=s.next();
        System.out.print("Enter Student marks: ");
        this.mks=s.nextFloat();
    }
    public void display(){
        System.out.println(this.rollNo+"\t"+this.name+"\t"+this.mks);
    }
}
class TestStudent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many students: ");
        int n=sc.nextInt();

        Student st[] = new Student[n];//array of references is created
        System.out.println("Enter "+n+" Students data");
        for(int i=0;i<n;i++){
            st[i] = new Student();//creating object of one by one: st[0],st[1],...st[n-1]
            st[i].accept();
        }
        System.out.println("ROLLNO\tNAME\tMARKS");
        for(int i=0;i<st.length;i++){
            st[i].display();
        }
        sc.close();
    }
}