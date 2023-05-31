public class CreateJavaBean {
    public static void main(String args []){
        Person p=new Person();
        p.setFirstName("Joshua");
        p.setLastName("Kimmich");
        p.setAge(28);
        System.out.println("Java Beans data: "+p.getFirstName()+" "+p.getLastName()+" "+p.getAge());
    }
}
