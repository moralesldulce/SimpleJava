
	import acm.graphics.*;
	import acm.program.*;
	import java.awt.event.*;
	//
	public class DrawingLines extends GraphicsProgram {
	 
	//starts the mouse listeners	
	 public void run() {
	 addMouseListeners();
	 }
	 
	 //calls to press for new line
	 public void mousePressed(MouseEvent e) {
		 double x = e.getX();
		 double y = e.getY();
		 line = new GLine(x, y, x, y);
		 add(line);
	 }
	 
	 //ends the line
	 public void mouseDragged(MouseEvent e) {
		 double x = e.getX();
		 double y = e.getY();
		 line.setEndPoint(x, y);
	 }
	 private GLine line;
	}


