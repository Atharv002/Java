import java.io.*;

interface EmpDeets{
    public void getEmpId();
    public void getEmpName(int id);
}

class usedInterface implements EmpDeets {
    public void getEmpId(){
        System.out.println("Employee ID");
    }
    public void getEmpName(int id){
        System.out.println("Employee Name"+id);
    }
}

class useInterface{
    public static void main(String args[]){
        usedInterface ud= new usedInterface();
        ud.getEmpId(); //get all employee id
        ud.getEmpName(1);
    }
}
