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
import javax.swing.JLayeredPane;

public class Main extends JFrame {
	public Main() {
		//Set up Grid
		String[][] a = new String[10][17];
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 17; y++) {
				a[x][y] = "";
			}
		}
		for(int x = 0; x < 10; x++)
			a[x][x] = "PERSON";
		Grid grid = new Grid(a);
		
		double imageSize = 58.9;
		JLayeredPane l = new JLayeredPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds((int)(width/2-1000/2), (int)(height/2-600/2), 1015, 610);
		setContentPane(l);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("MAIN GAME GOES HERE");
		setVisible(true);
		
		ImageLabel bg = new ImageLabel("battlescene.png");
		l.add(bg, 0);
		bg.setImageSize(1015, 640);
		
		ImageLabel[][] players = new ImageLabel[17][10];
		
		for(int i = 0; i < 17; i++) {
			for(int x = 0; x < 10; x++) {
				ImageLabel label = new ImageLabel("5.gif");
				l.add(label, 0);
				players[i][x] = label;
				label.setImageSize((int)imageSize, (int)(imageSize-0.3));
				label.setImageLocation((int)(imageSize*i), (int)((imageSize-0.3)*x));
			}
		}
		remove(players[0][0]);
		
		/*ImageLabel red = new ImageLabel("red.png");
		l.add(red, 0);
		red.setImageSize(700, 700);*/
	}
}