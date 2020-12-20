package bres;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*;
import java.util.List;

public class Main{
	
	public static void main(String[] args) {
		
		int frameWidth = 300;
		int frameHeight = 300;
		int buttframew = 500;
		int buttframeh = 300;
		JFrame foutput = new JFrame("Bresenham Output");
	    JFrame finput=new JFrame("Bresenham Input");  
	   // JFrame graph = new JFrame("graph");
		
		//panel 
		JPanel thickness = new JPanel();
        
		
	
		DrawingComponent circle = new DrawingComponent();
		//Graphview G1 = new Graphview();
		
		
		foutput.setSize(frameWidth, frameHeight);
		foutput.setLocation(100+buttframew,200);
		foutput.setVisible(true);
		foutput.getContentPane().add(circle);
	    foutput.addComponentListener(new ResizeListener());
	    
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	    JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30);
	    b.setFocusable(false);
	    b.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){
	    		String thik = tf.getText();
	    		int castthik = Integer.parseInt(thik);
	    		
	            tf.setText("success"+thik); 
	            circle.thickness = castthik;
	           circle.repaint();
	        }  
	    });
	    
	    tf.setText("ty[e something");
	    tf.setSize(100, 60);
        thickness.add(b, BorderLayout.CENTER);
        thickness.add(tf,BorderLayout.SOUTH);
        
	      
	    finput.setSize(buttframew,buttframeh);  
	    finput.setLocation(100,200);
	   // f.setLayout(null);  
	    finput.setVisible(true);
	    finput.setLayout(new BorderLayout());
        finput.add(thickness);
	    
        
   
	   // graph.setSize(300,300);
	   // graph.setVisible(true);
	   // graph.setLayout(new BorderLayout());
        //graph.getContentPane().add(new Graphview());
	}  
	    
	    
		  
			 
		   
		
	}


	