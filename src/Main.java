import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Main extends JFrame {
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds((int)(width/2-1000/2), (int)(height/2-600/2), 1000, 600);
		setContentPane(getContentPane());
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("MAIN GAME GOES HERE");
		setVisible(true);
		
		ImageLabel label = new ImageLabel("2.gif");
		getContentPane().add(label);
		label.setImageSize(700, 700);
	}
}