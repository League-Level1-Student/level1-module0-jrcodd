import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
    
	public static void main(String[] args) {
		CutenessTV ctv = new CutenessTV();
		ctv.GUIStuff();
		
		
		
	} 
	void GUIStuff() {
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.setText("Duck");
		button2.setText("frog");
		button3.setText("fluffyUnicorn");
		panel.add(button2);
		panel.add(button3);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			showDucks();
		}
		else if(e.getSource() == button2) {
			showFrog();
		}
		else {
			showFluffyUnicorns();
		}
	}
}
