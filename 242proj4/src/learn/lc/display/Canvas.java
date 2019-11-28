package learn.lc.display;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Canvas extends JComponent {
	
	protected int x1=0;
	protected int y1=0;
	
	public Canvas() {
		super();
		setPreferredSize(new Dimension(640, 480));
	}
	
//	public void addPoint(double x, double y) {
//		int curr_x= (int) (x);
//		int curr_y= (int) (1.0 - y) * (getHeight());
//		getGraphics().drawLine(x1, y1, curr_x, curr_y);
//		x1=curr_x;
//		y1=curr_y;
//		
//	}
	
	@Override
	public void paintComponent(Graphics g) {
	}

}
