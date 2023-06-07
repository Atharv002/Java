package packages;

public class Calculator2 {
    public static int mod(int a,int b){
        if(b==0){
            System.out.println("Division by zero error");
            return -1;
        }
        return a%b;
    }
    public static int abs(int a,int b){
        if(a>=b){return (a-b);}
        return (b-a);
    }
}
