package bres;
import java.awt.*;


public class DrawingComponent extends Component {
	public int thickness = 1; //experimental
	public static int radius = 90;
	public int numcircle = 5;
	
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
	
	public static void drawABunchOfBresenhamsCircles(int numOfCircles, double width, double height,int thick, Graphics g) {
	    double r = radius;
	    double step = (300.0-5.0)/numOfCircles;

	    for (int i = 1; i <= numOfCircles; i++) {
	        drawBresenhamsCircle((int)r, width, height, thick,g);
	        r += step;
	    }
	}
//	
	public void paint(Graphics g) {
		
		  Graphics2D g2D = (Graphics2D)g;
		  RenderingHints rhints = g2D.getRenderingHints();
		  boolean antialiasOn = rhints.containsValue(RenderingHints.VALUE_ANTIALIAS_ON);
		  System.out.println(antialiasOn);
		  g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		  	
		  
		  
		  g2D.setColor(Color.RED);
		  if(numcircle==1) {
			  drawBresenhamsCircle(radius, this.getWidth(), this.getHeight(),thickness, g);
		  }
		  else if(numcircle>=1) {
			  drawABunchOfBresenhamsCircles(numcircle,this.getWidth(),this.getHeight(),thickness,g);
		  }
		  
	}
}