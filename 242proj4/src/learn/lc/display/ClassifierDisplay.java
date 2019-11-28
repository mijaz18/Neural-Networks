package learn.lc.display;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ClassifierDisplay extends JFrame {
	
	protected Canvas canvas;
	
	protected int x1=0;
	protected int y1=0;
	
	public ClassifierDisplay(String file) {
		setTitle(file);
		canvas= new Canvas();
		canvas.setPreferredSize(new Dimension(800,800));
		add(canvas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	public void addPoint(double x, double y) {
		int curr_x= (int) (x * getWidth());
		int curr_y= (int) ((1.0 - y) * 750);
		//System.out.println("XXX "+ curr_x+ "YYYY "+ curr_y);
		canvas.getGraphics().drawLine(x1, y1, curr_x, curr_y);
		
		x1=curr_x;
		y1=curr_y;
		
	}


}
