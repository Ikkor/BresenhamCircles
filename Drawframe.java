package bres;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.*;
import java.util.List;

public class Drawframe{
	
	 {
		
		int frameWidth = 300;
		int frameHeight = 300;
		int buttframew = 500;
		int buttframeh = 300;
		JFrame foutput = new JFrame("Bresenham Output");
	    JFrame finput=new JFrame("Bresenham Input");  
	   // JFrame graph = new JFrame("graph");
		
		 
		DrawingComponent circle = new DrawingComponent();
		//Graphview G1 = new Graphview();
		
		
		
	    
	    
//	    JButton b=new JButton("Click Here");  
//	    b.setBounds(50,100,95,30);
//	    b.setFocusable(false);
//	    b.addActionListener(new ActionListener(){  
//	    public void actionPerformed(ActionEvent e){
//	    		String thik = tf.getText();
//	    		int castthik = Integer.parseInt(thik);
//	    		
//	            tf.setText("success"+thik); 
//	            circle.thickness = castthik;
//	           circle.repaint();
//	        }  
//	    });
//	    
	    //slider init 
	    JSlider thickslide = new JSlider(JSlider.HORIZONTAL, 0, 50, 1); 
	    JSlider radislide = new JSlider(JSlider.HORIZONTAL, 0,200,1);
	    JSlider numcircle = new JSlider(JSlider.HORIZONTAL,1,40,1);
	    
	    //adding changelisteners to the sliders to fetch values
	    
	    //num circles
	    numcircle.addChangeListener(new ChangeListener(){
	          public void stateChanged(ChangeEvent e) {
	              int circles = numcircle.getValue();
	              circle.numcircle = circles;
	              System.out.println(circles);
	              circle.repaint();
	          }
	    });
	    
	    //thickness
	    thickslide.addChangeListener(new ChangeListener(){
	          public void stateChanged(ChangeEvent e) {
	              int thickint = thickslide.getValue();
	              circle.thickness = thickint;
	              System.out.println(thickint);
	              circle.repaint();
	          }
	    });
	    
	    //radius 
	    radislide.addChangeListener(new ChangeListener(){
	          public void stateChanged(ChangeEvent e) {
	              int radiint = radislide.getValue();
	              circle.radius = radiint;
	              circle.repaint();
	          }
	    });
	    
	    
	    
	    thickslide.setMinorTickSpacing(2);  
		thickslide.setMajorTickSpacing(10);  
		thickslide.setPaintTicks(true);  
		thickslide.setPaintLabels(true); 
		
		numcircle.setMinorTickSpacing(2);  
		numcircle.setMajorTickSpacing(10);  
		numcircle.setPaintTicks(true);  
		numcircle.setPaintLabels(true); 
			
		radislide.setMinorTickSpacing(2);  
		radislide.setMajorTickSpacing(10);  
		radislide.setPaintTicks(true);  
		radislide.setPaintLabels(true);   
		 
		
		
	    
		JPanel grpane = new JPanel();
		grpane.setLayout(new GridLayout(6, 1, 1, 1));
		
		JLabel label1, label2,label3;
		  
	      
	        //Create labels.
	    label1 = new JLabel("Radius",JLabel.CENTER);    	       
	    label2 = new JLabel("Thickness", JLabel.CENTER);
	    label3 = new JLabel("Number of Circles",JLabel.CENTER);
	       
	 
	        //Add the labels.
	    grpane.add(label1);
	    grpane.add(radislide);
	    grpane.add(label2);
	    grpane.add(thickslide);
	    grpane.add(label3);
	    grpane.add(numcircle);
	      
	    finput.add(grpane,BorderLayout.CENTER);
	    finput.setSize(buttframew,buttframeh);  
	    finput.setLocation(100,200);
	   // f.setLayout(null);  
	    finput.setVisible(true);
	    finput.setLayout(new BorderLayout());
        
        
        foutput.setSize(frameWidth, frameHeight);
		foutput.setLocation(100+buttframew,200);
		foutput.setVisible(true);
		foutput.getContentPane().add(circle);
	    foutput.addComponentListener(new ResizeListener());
    
	}  
	    
		
	}



	