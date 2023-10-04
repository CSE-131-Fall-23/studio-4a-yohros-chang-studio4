package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		// Rectangles
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		
		StdDraw.setPenColor(200, 200, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.395, 0.245);
		
		// Fish body
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.005);
		StdDraw.ellipse(0.55, 0.5, 0.12, 0.07);
		
		// Fish tail
		double[] x = {0.428, 0.35, 0.35};
		double[] y = {0.5, 0.55, 0.45};
		StdDraw.polygon(x, y);
		
		// Text
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.5, 0.375, "be nice, eat fish");
	}
}