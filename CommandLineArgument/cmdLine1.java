// JVM enters A(class) without creating its object hence main() is static
// JVM calls main() outside class hence main() is public
// main() is one entrypoint
class A{
    static public void main(String args[]){
        System.out.println("Hello JVM");
        int n=args.length;
        System.out.println("No of cmdline aruments:"+args.length);
        for(int i=0;i<n;i++)
            System.out.println("arguments no "+i+" :"+args[i]);
    }
}