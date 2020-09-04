import gpdraw.*;

/**
 * 
 * @author Aaditya Bhoota
 * Period 3
 */

public class KochCurve {
	private DrawingTool marker;
	private SketchPadWithNoDelay poster;
	
	public KochCurve(int length, int width, int xPos, int yPos) {
		poster = new SketchPadWithNoDelay(length, width, xPos, yPos);
		marker = new DrawingTool(poster);
		marker.turnRight();
		marker.up();
		marker.backward(100);
		marker.down();
	}
	
	public void drawKochCurve(int level, double length) {
		if (level < 1) {
			marker.forward(length);
		}
		else {
			drawKochCurve(level - 1, length / 3);
			marker.turnLeft(60);
			drawKochCurve(level - 1, length / 3);
			marker.turnRight(120);
			drawKochCurve(level - 1, length / 3);
			marker.turnLeft(60);
			drawKochCurve(level - 1, length / 3);
		}
	}
	public void drawSnowflake(int level, double length) {
		drawKochCurve(level, length);
		marker.turnRight(120);
		drawKochCurve(level, length);
		marker.turnRight(120);
		drawKochCurve(level, length);
		marker.turnRight(120);
	}
}
