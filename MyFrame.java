import java.awt.*;
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent; 

public class MyFrame extends Frame { 
	public MyFrame() 
	{ 
		setVisible(true); 
		setSize(300, 300); 
		addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) 
			{ 
				System.exit(0); 
			} 
		}); 
	} 
	public void paint(Graphics g) 
	{ 
		int[] x = { 50, 100, 150, 200, 150, 100 }; 
		int[] y1 = { 100, 80, 80, 100, 120, 120 }; 
		g.drawPolygon(x, y1, 6); 
		int[] y2 = { 160, 140, 140, 160, 180, 180 }; 
		g.fillPolygon(x, y2, 6); 
	} 

	public static void main(String[] args) 
	{ 
		new MyFrame(); 
	} 
}
