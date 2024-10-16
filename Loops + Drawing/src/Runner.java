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
        g2.setStroke(new BasicStroke(5));
        
        int red;
        int green;
        int blue;
        Color color;
		 
		//DRAW RECTANGLES IN TOP LEFT
		g2.drawRect(10, 10, 765, 540);
		int numOfLines = 0;
		while (numOfLines < 30) {
		    red = (int) (Math.random() * (255));   // 0-255 for red
            green = (int) (Math.random() * (255)); // 0-255 for green
            blue = (int) (Math.random() * (255));  // 0-255 for blue
            color = new Color(red, green, blue);
            g2.setColor(color);
       // Generate random start and end points for the line within the rectangle
            int startX = 10 + (int) (Math.random() * 100); // 10 to 775
            int startY = 10 + (int) (Math.random() * 200); // 10 to 550
            int endX = 10 + (int) (Math.random() * 350);   // 10 to 775
            int endY = 10 + (int) (Math.random() * 250);   // 10 to 550
            
       // Draw the line with the generated coordinates
            g2.drawLine(startX, startY, endX, endY);
            numOfLines++;
           
            

		}
		
		
		//2) DRAW CIRCLES IN BOTTOM LEFT
		// Drawing circles in the bottom left
		g2.drawLine(10, 270, 770, 270); // This line separates the top and bottom areas

		int numOfCircles = 0;
		while (numOfCircles < 30) {
		    red = (int) (Math.random() * 256);   // 0-255 for red
		    green = (int) (Math.random() * 256); // 0-255 for green
		    blue = (int) (Math.random() * 256);  // 0-255 for blue
		    color = new Color(red, green, blue);
		    g2.setColor(color);
		    
		    // Generate a random diameter for the circle
		    int diameter = 10 + (int) (Math.random() * 100); // Diameter: 10 to 110

		    // Generate random center point for the circle within the bottom left box
		    int centerX = 10 + (int) (Math.random() * (360 - diameter)); // Ensure it fits
		    int centerY = 270 + (int) (Math.random() * (250 - diameter)); // Ensure it fits

		    // Draw the circle using the top-left corner coordinates
		    g2.drawOval(centerX, centerY, diameter, diameter);
		    numOfCircles++;
		}

           
		
		
		// Draw a vertical line to bisect the shape again
		g2.drawLine(765 / 2, 10, 765 / 2, 550);

		// Drawing filled squares in the top right
		int squareSize = 30; // Size of the squares
		int numOfSquares = 0;

		while (numOfSquares < 30) {
		    red = (int) (Math.random() * 256);   // 0-255 for red
		    green = (int) (Math.random() * 256); // 0-255 for green
		    blue = (int) (Math.random() * 256);  // 0-255 for blue
		    color = new Color(red, green, blue);
		    g2.setColor(color);
		    
		    // Generate random position for the square within the top right box
		    int startX = 765 - squareSize - (int) (Math.random() * (765 - 765 / 2 - squareSize)); // Ensure it fits within top right
		    int startY = 20 + (int) (Math.random() * 200); // Y: 10 to 280

		    // Draw the filled square
		    g2.fillRect(startX, startY, squareSize, squareSize);
		    numOfSquares++;
		}


		
		
		//4) small rectangles on top-left
		
		
		
		
		
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
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
