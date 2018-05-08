import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	
	
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
		
		
		
		
	} public void showButton() {
		 System.out.println("Button clicked");
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.add(button);
		frame.setVisible(true);
		button.addActionListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		 if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You're fortune is that you will have a great day tomorow!!");
		}else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You're fortune is that you will have no errors in your next program!!");
		}else if( rand == 2) {
			JOptionPane.showMessageDialog(null, "You're fortune is that you will you will find money on the ground!!");
		}else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You're fortune is that you will get an A+ on your next test!!");
		}else if( rand == 4) {
			JOptionPane.showMessageDialog(null, "You're fortune is that you will be happy");
		}
		
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
}
