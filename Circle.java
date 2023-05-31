import java.util.*;

public class Circle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float num=sc.nextFloat();
        System.out.println(num);
        CircleAreaPeri obj=new CircleAreaPeri();
        System.out.println("Area of Circle is: " +obj.getArea(num));
        System.out.println("Perimeter of Circle is: "+obj.getPeri(num));
        sc.close();
    }
}

class CircleAreaPeri{
    public float getArea(float radius){
        float area=(float)3.14*radius*radius;
        return area;
    }

    public float getPeri(float radius){
        float peri=(float)(2*3.14*radius);
        return peri;
    }
}





