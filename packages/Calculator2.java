package packages;

public class Calculator2 {
    public static int mod(int a,int b){
        if(b==0){
            System.out.println("Division by zero error");
            return -1;
        }
        return (a%b);
    }
    public static int power(int a, int b){
        int sum=1;
        for(int i=1;i<=b;i++){
            sum*=a;
        }
        return sum;
    }
}
