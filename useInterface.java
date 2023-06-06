import java.io.*;

interface EmpDeets{
    public void getEmpId();
    public void getEmpName(int id);
}

class usedInterface implements EmpDeets {
    public void getEmpId(){
        System.out.println("something something");
    }
    public void getEmpName(int id){
        System.out.println("Something else "+id);
    }
}

class useInterface{
    public static void main(String args[]){
        usedInterface ud= new usedInterface();
        ud.getEmpId();
        ud.getEmpName(1);
    }
}
