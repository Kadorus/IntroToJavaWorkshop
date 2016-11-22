package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		
	
		
		Robot firstBot = new Robot();
		
		Robot secondBot = new Robot();
		
		secondBot.setPenColor(Color.CYAN);
		
		secondBot.setSpeed(50);
		
		firstBot.turn(45);
		
		secondBot.turn(180);
		
		firstBot.move(50);
		
		secondBot.move(500);
		
		firstBot.turn(90);
		
		secondBot.turn(180);
		
		firstBot.move(25);
		
		secondBot.move(100);
		
		secondBot.penDown();
		
		secondBot.move(100);
		
		secondBot.move(-50);
		
		secondBot.turn(90);
		
		secondBot.move(50);
		
		secondBot.turn(90);
		
		secondBot.move(50);
		
		secondBot.move(-100);
		
		secondBot.penUp();
		
		secondBot.move(50);
		
		secondBot.turn(-90);
		
		secondBot.move(100);
		
		secondBot.turn(90);
		
		secondBot.penDown();
		
		secondBot.move(50);
		
		secondBot.move(-100);
		
		secondBot.penUp();
		
		secondBot.turn(180);
		
		secondBot.setSpeed(200);
		
		secondBot.move(1000);
		
		firstBot.turn(45);
		
		firstBot.move(-250);
		
		firstBot.penDown();
		
		firstBot.sparkle();
		
		firstBot.setPenColor(Color.YELLOW);
		
		for(int i = 1; i <= 4; i++){
			
			firstBot.move(250);
			
			firstBot.turn(90);
			
		}
		
	}
}
