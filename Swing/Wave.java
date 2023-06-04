import java.awt.*;
import javax.swing.*;

public class Wave extends JPanel {
	int SCALEFACTOR = 200;
	int cycles;
	int points;
	double[] sines;
	int[] pts;
	public  void setCycles(int cycles) {
		this.cycles = cycles;
		this.points = SCALEFACTOR * cycles * 2;
		this.sines = new double[points];
		for (int i = 0; i < points; i++) {
			double radians = (Math.PI / SCALEFACTOR) * i;
			this.sines[i] = Math.sin(radians);
		}
	}
	public void paintComponent(Graphics g) {
		int maxWidth = getWidth();
		double hstep = (double) maxWidth / (double) points;
		int maxHeight = getHeight();
		pts = new int[points];
		for (int i = 0; i < points; i++){
			pts[i] = (int) (sines[i] * maxHeight / 2 * .9 + maxHeight / 2);
		}
		g.setColor(Color.RED);
		for (int i = 1; i < points; i++) {
			int x1 = (int) ((i - 1) * hstep);
			int x2 = (int) (i * hstep);
			int y1 = pts[i - 1];
			int y2 = pts[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}
    public static void main(String[] args) {
		JFrame frame = new JFrame("Printing wave pattern using Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		Wave obj = new Wave();
		obj.setCycles(10);
		frame.add(obj);
		frame.setVisible(true);
	}
}

