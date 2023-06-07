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
        if(b==0){return -1;}
        return 0;
    }
}
