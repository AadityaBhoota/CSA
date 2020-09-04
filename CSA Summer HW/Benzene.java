/**
	 * @author Aaditya Bhoota
	 * Creates the abbreviated symbol for Benzene
 */
import gpdraw.*;

public class Benzene {
	private DrawingTool marker;
	private SketchPad poster;

	public Benzene() {
		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);
	}
	
	public void draw( ) {
		marker.drawCircle(100);
		marker.up();
		marker.move(0,-150);
		marker.setDirection(30);
		marker.down();
		marker.forward(150);
		marker.setDirection(90);
		marker.forward(150);
		marker.setDirection(150);
		marker.forward(150);
		marker.setDirection(210);
		marker.forward(150);
		marker.setDirection(270);
		marker.forward(150);
		marker.setDirection(330);
		marker.forward(150);
	}
}
