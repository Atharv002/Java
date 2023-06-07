import packages.*;

public class usePack{
    public static void main(String args[]) {
        System.out.println(packages.Calculator1.add(1,2));
        System.out.println(packages.Calculator1.sub(3,4));
        System.out.println(packages.Calculator1.mul(3,4));
        System.out.println(packages.Calculator1.div(4,2));
        System.out.println(packages.Calculator2.mod(5,4));
        System.out.println(packages.Calculator2.abs(3,5));
        System.out.println(packages.Calculator2.pow(2,3));
    }
}
