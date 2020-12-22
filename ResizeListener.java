package bres;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ResizeListener implements ComponentListener {

	        public void componentHidden(ComponentEvent e) {}
	        public void componentMoved(ComponentEvent e) {}
	        public void componentShown(ComponentEvent e) {}

	        public void componentResized(ComponentEvent e) {
	            Dimension newSize = e.getComponent().getBounds().getSize(); 
	            System.out.println(newSize.height);
	        
	        }  
	      
}
	    
