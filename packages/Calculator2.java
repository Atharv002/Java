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
    public static int pow(int a, int b){
        if(b==0){return 1;}
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        return ans;
    }
}
