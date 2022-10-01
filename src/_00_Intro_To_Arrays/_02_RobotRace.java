package _00_Intro_To_Arrays;

import java.awt.Window;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	

        // 2. create an array of 5 robots.
Robot[]race= new Robot[5];

        // 3. use a for loop to initialize the robots.
for(int i=0; i<race.length;i++) {
	race[i]=new Robot(130+i*150,750);
	race[i].setWindowSize(900, 800);
	race[i].setSpeed(50);
}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    Random robotmove= new Random();
    
    while (true) {
		
    for (int i = 0; i < race.length; i++) {
    race[i].move(robotmove.nextInt(50));
    if (race[i].getY()<=0) {
		JOptionPane.showMessageDialog(null, "You Win!");
		System.exit(0);
	}
	}
    }
    
    // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
   
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
}
}
