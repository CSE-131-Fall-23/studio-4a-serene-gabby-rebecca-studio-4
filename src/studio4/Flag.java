package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.6, 0.5, 0.3);

		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.6, 0.5, 0.3);

		double[] xvals = { 0.4, 0.5, 0.6, 0.7 };
		double[] yvals = { 0.4, 0.5, 0.4, 0.5 };
		double radi = 0.05;
		for (int i = 0; i < xvals.length; i++) {
			StdDraw.setPenColor(Color.YELLOW);
			StdDraw.filledCircle(xvals[i], yvals[i], radi);
		}
	}
}