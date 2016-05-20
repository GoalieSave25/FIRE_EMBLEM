import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Main extends JFrame {
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		
		ImageLabel label = new ImageLabel("2.gif");
		getContentPane().add(label);
		label.setImageSize(700, 700);
	}
}