import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener{
	JButton button = new JButton();
	JButton button2 = new JButton();
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);

	public static void main(String[] args) {
		soundEffects sf = new soundEffects();
		sf.frank();
	}
	
	
	
	
private void frank() {
JFrame frame = new JFrame();	
JPanel panel = new JPanel();
	
	frame.setVisible(true);
	frame.add(panel);
	button2.setPreferredSize(SMALL);
	button.setPreferredSize(BIG);
	panel.add(button);
	panel.add(button2);
	
	button.setText("sound 1!!!");
	button2.setText("sound 2!!!");

	button.addActionListener(this);
	button2.addActionListener(this);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
}
	
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
		playSound("thing.wav");
	}
		else{
		playSound("thing2.wav");
		}
		}

}
