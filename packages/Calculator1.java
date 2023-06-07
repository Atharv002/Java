package packages;

public class Calculator1 extends Exception{
    public static int add(int a, int b){
        int ans=a+b;
        return ans;
    }
    public static int sub(int a, int b){
        int ans=a-b;
        return ans;
    }
    public static int mul(int a, int b){
        int ans=a*b;
        return ans;
    }
    public static int div(int a, int b){
        if(b==0){
            System.out.println("Division by zero error");
            return -1;
        }
        return (a/b);
    }
}
