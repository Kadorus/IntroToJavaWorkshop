package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot dog = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		dog.setSpeed(10);
		// 5. Set the pen width to 5
		dog.setPenWidth(4);
		// 6. Do steps #7 to #8 four times...
		
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
			drawSquare(12);
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare(int sides) {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		for(int i = 0; i < sides; i++){
		
			dog.penDown();
			
			for(int x = 0; x < sides+1; x++){			
			dog.setRandomPenColor();
				
			dog.move(160/sides+x*80/sides);
				
			dog.turn(360/sides);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
