package packages;

public class Calculator extends Exception{
    public static int add(int a, int b){
        return (a+b);
    }
    public static int sub(int a, int b){
        return (a-b);
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        try{
            return a/b;
        }
        catch (Exception e){
            System.out.println("Error detected");
            e.printStackTrace();
        }
    }
}
