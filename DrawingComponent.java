package bres;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;


public class DrawingComponent extends Component {
	
	public static double getNativeX(double newX, double width) {
	    return newX + (width/2);
	}

	public static double getNativeY(double newY, double height) {
	    return (height/2) - newY;
	}
	
	public static void drawPixel(double x, double y,double width,double height, int thick, Graphics g) {
	    double nativeX = getNativeX(x, width);
	    double nativeY = getNativeY(y, height);
	    g.fillRect((int)nativeX, (int)nativeY, thick, thick);
	}
	
	
	public static void drawBresenhamsCircle(int r, double width, double height,int thick, Graphics g) {
	    int x,y,d;
	    y = r;
	    x = 0;
	    
	    
	    drawPixel(x, y, width, height,thick,g);
	    d = (3-2*(int)r);
	    while (x <= y) {
	        if (d <= 0) {
	            d = d + (4*x + 6);
	        } else {
	            d = d + 4*(x-y) + 10;
	            y--;
	        }
	        x++;

	        //segments 
	        
	        drawPixel(x, y, width, height,thick,g);

	        drawPixel(-x, y, width, height,thick,g);
	        drawPixel(x, -y, width, height,thick,g);

	        drawPixel(-x, -y, width, height,thick,g);
	        drawPixel(y, x, width, height,thick,g);
	        drawPixel(-y, x, width, height,thick,g);
	        drawPixel(y, -x, width, height,thick,g);

	        drawPixel(-y, -x, width, height,thick,g);
	    }   
	}
	
//	public static void drawABunchOfBresenhamsCircles(int numOfCircles, double width, double height,int thick, Graphics g) {
//	    double r = 5;
//	    double step = (300.0-5.0)/numOfCircles;
//
//	    for (int i = 1; i <= numOfCircles; i++) {
//	        drawBresenhamsCircle((int)r, width, height, g,thick);
//	        r += step;
//	    }
//	}
//	
	public void paint(Graphics g) {
		  Graphics2D g2D = (Graphics2D)g;
		  	int thickness = 1; //experimental
		  	
		    g2D.setColor(Color.RED);

		    drawBresenhamsCircle(100, this.getWidth(), this.getHeight(),thickness, g);

		  
		  
	}
}
