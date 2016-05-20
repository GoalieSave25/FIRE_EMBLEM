import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Main extends JFrame {
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		
		Image img = new ImageIcon("Chara GIFs/2.gif").getImage();
		img = img.getScaledInstance(70, 70, 0);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(img));
		getContentPane().add(label);
	}

}