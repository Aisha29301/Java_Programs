import java.util.Scanner;
class Student1{
    private int rollNo;
    private String name;
    private float mks;
    public Student1(int rollNo,String name,float mks){
      this.rollNo=rollNo;
      this.name=name;
      this.mks=mks;
    }
    public void display(){
        System.out.println(this.rollNo+"\t"+this.name+"\t"+this.mks);
    }
}
class TestStudent1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many students: ");
        int n=s.nextInt();

        Student1 st[] = new Student1[n];//array of references is created
        int sroll; String sname; float smks;
        System.out.println("Enter "+n+" Students data");
        for(int i=0;i<n;i++){
            
            System.out.print("Enter Student roll no.: ");
            sroll=s.nextInt();
            System.out.print("Enter Student name: ");
            sname=s.next();
            System.out.print("Enter Student marks: ");
            smks=s.nextFloat();

            st[i] = new Student1(sroll,sname,smks);//creating object of one by one: st[0],st[1],...st[n-1]
        }
        System.out.println("ROLLNO\tNAME\tMARKS");
        //using for-each loop
        for(Student1 temp : st)
                temp.display();
        s.close();
    }
}