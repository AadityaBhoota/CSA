/**
	 * @author Aaditya Bhoota
	 * Creates a house
*/
import gpdraw.*;

public class DrawHouse {
	private DrawingTool marker;
	private static SketchPad poster;
	
	public DrawHouse() {
		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);
	}	
	
	public void draw() {
		marker.up();
		marker.backward(50);
		marker.down();
		marker.drawRect(350, 200);
		marker.up();
		marker.backward(50);
		marker.down();
		marker.drawRect(50, 100);
		marker.up();
		marker.backward(50);
		marker.turnRight(90);
		marker.forward(175);
		marker.turnLeft(90);
		marker.forward(200);
		marker.down();
		marker.turnLeft(60);
		marker.forward(200);
		marker.turnLeft(59.5);
		marker.forward(203);
		marker.up();
		marker.move(100,0);
		marker.down();
		marker.drawRect(50, 50);
		marker.up();
		marker.move(-100, 0);
		marker.down();
		marker.drawRect(50, 50);

	}
}

