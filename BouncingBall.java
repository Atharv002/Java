import java.awt.Color;
import java.awt.Graphics;

public class BouncingBall extends Applet implements Runnable {
    private int x, y;               // current position of the ball
    private int xSpeed = 2;         // horizontal speed of the ball
    private int ySpeed = 2;         // vertical speed of the ball
    private int radius = 20;        // radius of the ball
    private Thread animationThread; // thread for animation

    public void init() {
        setSize(400, 400);  // set the size of the applet window
        setBackground(Color.white);
    }

    public void start() {
        // Create and start the animation thread
        if (animationThread == null) {
            animationThread = new Thread(this);
            animationThread.start();
        }
    }

    public void stop() {
        // Stop the animation thread
        if (animationThread != null) {
            animationThread.interrupt();
            animationThread = null;
        }
    }

    public void run() {
        // Animation loop
        while (true) {
            // Update the position of the ball
            x += xSpeed;
            y += ySpeed;

            // Check if the ball hits the applet boundaries
            if (x + radius >= getWidth() || x - radius <= 0) {
                xSpeed = -xSpeed;  // reverse the horizontal direction
            }
            if (y + radius >= getHeight() || y - radius <= 0) {
                ySpeed = -ySpeed;  // reverse the vertical direction
            }

            try {
                Thread.sleep(10);  // delay between frames
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
                break;
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
