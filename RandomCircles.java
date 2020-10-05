import acm.program.*;
import acm.graphics.*;
import acm.util.*; 

public class RandomCircles extends GraphicsProgram {

	//all fixed numbers
	private static final int NUMBER_OF_CIRCLES = 10;
	private static final int MAX_RADIUS_SIZE = 50;
	private static final int MIN_RADIUS_SIZE = 5;
	
	//use a for loop since we know the number of times that
	//we should retrieve a circle
	public void run() {
		
		for (int i = 0; i<= NUMBER_OF_CIRCLES; i++) {
			getRandomCircle();	
		}
	}
	
	//generate random circles by size and color
	private void getRandomCircle() {
		double circleSize = rgen.nextDouble(MIN_RADIUS_SIZE, MAX_RADIUS_SIZE);
		double pointX = rgen.nextDouble(0, (getWidth()) - (2 * circleSize));
		double pointY = rgen.nextDouble(0,(getHeight()) - (2 * circleSize));
		GOval randomCircle = new GOval (pointX, pointY, 2*circleSize, 2*circleSize);
		randomCircle.setFilled(true);
		randomCircle.setColor(rgen.nextColor());
		add(randomCircle);
	}
	
	//create an instance variable for the random generator
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
