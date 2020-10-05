import acm.graphics.*;
import acm.program.*;
import java.awt.*;




public class DrawingAFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 250;
	private static final int HEAD_HEIGHT = 375;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_wIDTH = 150;
	private static final int MOUTH_HEIGHT= 50;
	
	public void run () {
		
		GRect rectFace = new GRect (HEAD_WIDTH, 50, HEAD_WIDTH,HEAD_HEIGHT );
		rectFace.setFilled(true);
		rectFace.setColor(Color.GRAY);
		add(rectFace);
		
		GRect rectOutline = new GRect (HEAD_WIDTH, 50, HEAD_WIDTH,HEAD_HEIGHT );
		rectOutline.setFilled(false);
		add (rectOutline);
		
		GRect rectMouth = new GRect (300,300, MOUTH_wIDTH,50);
		rectMouth.setFilled(true);
		rectMouth.setColor(Color.WHITE);
		add(rectMouth);
		
		GOval rightEye = new GOval (312.5,143.75, EYE_RADIUS,EYE_RADIUS);
		rightEye.setFilled(true);
		rightEye.setColor(Color.YELLOW);
		add(rightEye);
		
		GOval leftEye = new GOval (412.5,143.75, EYE_RADIUS,EYE_RADIUS);
		leftEye.setFilled(true);
		leftEye.setColor(Color.YELLOW);
		add(leftEye);
		
		
	}
	
}

