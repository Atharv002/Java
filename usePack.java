import packages.*;

public class usePack {
    public static void main(String args[]) {
        int val = Calculator.add(1,2);
        System.out.println(val);
        int val2 = packages.Calculator2.mul(3,2);
        System.out.println(val2);
        int val3=packages.Calculator.sub(2,1);
        System.out.println(val3);
    }
}
