import java.util.Random;

public class Fish {
	boolean foundtreasure = false;
	String myColor;
	int myAge;

	public Fish(String color, int age) {
		myColor = color;
		myAge = age;
	}

	void explore() {
		Random lucky = new Random(2);
		int l = lucky.nextInt(2);
		if (l == 1) {
			foundtreasure = true;
		}
		if (foundtreasure) {
			System.out.println("Yay the fish found treasure!!");
		}

	}
}
