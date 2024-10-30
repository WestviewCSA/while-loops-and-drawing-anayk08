import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
       
        
        int red;
        int green;
        int blue;
        Color color;
		 
		 
		
     // Draw the left side of the rectangle
        for (int y = 0, x = 0; y <= 1000; y+= 20) {
        	g2.drawLine(0, y, x, 1000);
        	x+=20;
        }
        for (int y=0, x=1000; y<=1000; y+= 20) {
        	g2.drawLine(0, y, x, 0);
        	x-=20;
        }
        
        int x3 = 1200;
        int y3 = 0;
        while (y3 <=1000) {
        	g2.drawLine(1200, y3, x3, 1000);
        	x3 -= 20;
        	y3 += 20;
        }
        
      
        int x4 = 200;
        int y4 = 0;
        
        while (y4 <= 1000) {
        g2.drawLine(1200, y4, x4, 0);
    	x4+=20;
    	y4 += 20;
        }
       
		
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200,1000);
		f.add(this);
		f.setVisible(true);
		
		
	}
}
