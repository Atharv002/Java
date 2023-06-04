import java.awt.Graphics;
import javax.swing.JFrame;

public class Circle extends JFrame{
public Circle()
{
 super("Circle In GUI");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400,400);
 setVisible(true);
}
public void paint(Graphics gh){
    super.paint(gh);
    gh.drawOval(80,80,150,150);
}
public static void main(String[]args){
     Circle obj =new Circle();
   }
}
