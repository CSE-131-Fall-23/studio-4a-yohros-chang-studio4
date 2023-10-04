package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double xRadius = in.nextDouble();
		double yRadius = in.nextDouble();
		
		StdDraw.setPenColor(r, g, b);
		
		if (shape.equals("rectangle"))
		{
			if (isFilled == true)
				StdDraw.filledRectangle(x, y, xRadius, yRadius);
			else
				StdDraw.rectangle(x, y, xRadius, yRadius);
		}
		
		if (shape.equals("ellipse"))
		{
			if (isFilled == true)
				StdDraw.filledEllipse(x, y, xRadius, yRadius);
			else
				StdDraw.ellipse(x, y, xRadius, yRadius);
		}
		
		if (shape.equals("triangle"))
		{
			double a = in.nextDouble();
			double z = in.nextDouble();
			
			double[] xs = {x, xRadius, a};
			double[] ys = {y, yRadius, z};
			
			if (isFilled == true)
				StdDraw.filledPolygon(xs, ys);
			else
				StdDraw.polygon(xs, ys);
		}

		
	}
}
