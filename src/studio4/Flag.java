package studio4;

import java.awt.Color;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		// int colorR = Math.random()*;
		// int colorG = in.nextInt();
		// int colorB = in.nextInt();
		Color color = new Color (0, 153, 0);
		double x = 0.5;
		double y = 0.5;
		double halfWidth = 0.4;
		double halfHeight = 0.2;
		StdDraw.setPenColor (color);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
		
		double[] xAxis = {0.58, 0.55, 0.52};
		double[] yAxis = {0.58, 0.62, 0.58};
		StdDraw.setPenColor(10, 20, 30);
		StdDraw.filledPolygon(xAxis, yAxis);
		
		double[] xAgain = {0.43, 0.40, 0.37};
		double[] yAgain = {0.58, 0.62, 0.58};
		StdDraw.setPenColor(255, 153, 0);
		StdDraw.filledPolygon(xAgain, yAgain);
		
		StdDraw.setPenColor(102, 51, 0);
		StdDraw.filledRectangle(0.45, 0.48, 0.2, 0.1);
		
		
		
	}
}