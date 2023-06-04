class Animal{
    public void greet(){
        System.out.println("Greetings");
    }
}

class Dog extends Animal{
    public void greet(){
        System.out.println("Barking123");
    }
    public void greet2(){
        super.greet();
    }
}

class Puppy extends Dog{
    public void wheeze(){
        System.out.println("Wheezing");
    }
}


public class superKW {
    public static void main(String args[]){
        Puppy p = new Puppy();
        p.greet();
        p.greet2();
    }
}