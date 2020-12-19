package bres;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main{
	
	public static void main(String[] args) {
		
		int frameWidth = 300;
		int frameHeight = 300;
		javax.swing.JFrame frame = new javax.swing.JFrame();
	    JButton b=new JButton("Click Here"); 
	    b.setBounds(50,100,94,30);
	    frame.add(b);
		frame.setSize(frameWidth, frameHeight);
		frame.setVisible(true);
		frame.getContentPane().add(new DrawingComponent());
	    frame.addComponentListener(new ResizeListener());

		  
			 
		   
		
	}
}

	