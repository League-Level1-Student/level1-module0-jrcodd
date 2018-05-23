import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static int intheight = 0;
	static Robot rob = new Robot("mini");
	static Random ran = new Random();
public static void main(String[] args) {
	Houses house = new Houses();
house.start();
	
	
	for( int i = 0; i<6; i++) {
		int ran2 = ran.nextInt(3);
		if(ran2 == 0) {
	pointyHouse("small", Color.BLUE);
	}
		else if(ran2 == 1) {
		pointyHouse("medium", Color.CYAN);	
		}
		else if(ran2 == 2){
			flatHouse("large", Color.YELLOW);
		}
		}
	
}

private static void flatHouse(String height, Color color) {
	
	if(height.equals("small")) {
		intheight = 60;
	}
	else if(height.equals("medium")) {
		intheight = 120;
		
	}
	else if(height.equals("large")) {
		intheight = 250;
	}
	rob.setSpeed(100);
rob.setPenColor(Color.GREEN);
rob.setAngle(90);
rob.move(50);
rob.penDown();
rob.move(50);
rob.setPenColor(color);
rob.turn(-90);
rob.move(intheight);
rob.setAngle(90);
rob.move(50);
rob.setAngle(180);
rob.move(intheight);
rob.setAngle(0);
}
private static void pointyHouse(String height, Color color) {
	if(height.equals("small")) {
		intheight = 60;
	}
	else if(height.equals("medium")) {
		intheight = 120;
		
	}
	else if(height.equals("large")) {
		intheight = 250;
	}
	rob.setSpeed(100);
rob.setPenColor(Color.GREEN);
rob.setAngle(90);
rob.move(50);
rob.penDown();
rob.move(50);
rob.setPenColor(color);
rob.turn(-90);
rob.move(intheight);
rob.setAngle(45);
rob.move(25);
rob.setAngle(90+45);
rob.move(25);
rob.setAngle(180);
rob.move(intheight);
rob.setAngle(0);
}
void start() {
	rob.setY(500); rob.setX(0);
	rob.setSpeed(100);
	rob.setWindowColor(Color.BLACK);
}
}
