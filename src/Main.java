import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Main extends JFrame {
	private int selectorx = 0;
	private int selectory = 0;
	CharacterIcon selector = new CharacterIcon("selector");
	class Keyboard implements KeyListener {
		private boolean[] keys = new boolean[100];
		public void keyPressed(KeyEvent e) {
			int k = e.getKeyCode();
			if(k < 100)
				keys[k] = true;
			if(k == 87 || k == 38 && selectory > 0)
				selectory--;
			else if(k == 65 || k == 37 && selectorx > 0)
				selectorx--;
			else if(k == 83 || k == 40 && selectory < 9)
				selectory++;
			else if(k == 68 || k == 39 && selectorx < 16)
				selectorx++;
			redrawSelector();
			
			/*
				W: 87
				A: 65
				S: 83
				D: 68
				UP: 38
				LEFT: 37
				DOWN: 40
				RIGHT: 39
			 */
		}

		public void keyReleased(KeyEvent e) {
			keys[e.getKeyCode()] = false;
		}

		public void keyTyped(KeyEvent e) {
			
		}
		
		public boolean getKey(int keyCode) {
			return keys[keyCode];
		}
		
		public boolean[] getAllKeys() {
			return keys;
		}
	}
	public Main(String name) {
		setIconImage(new ImageIcon("icon.jpg").getImage());
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
		setBounds((int)(width/2-1000/2), (int)(height/2-600/2), 1017, 612);
		setContentPane(l);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("Fire Emblem - Revenge of GS25");
		setVisible(true);
		Keyboard k = new Keyboard();
		addKeyListener(k);
		
		/*
			W: 87
			A: 65
			S: 83
			D: 68
			UP: 38
			LEFT: 37
			DOWN: 40
			RIGHT: 39
		 */
		
		ImageLabel bg = new ImageLabel("battlescene.png");
		l.add(bg, 0);
		bg.setImageSize(1017, 640);
		
		CharacterIcon[][] players = new CharacterIcon[17][10];
		
		for(int i = 0; i < 17; i++) {
			for(int x = 0; x < 10; x++) {
				CharacterIcon label = new CharacterIcon(name);
				label.setGridLocation(i, x);
				l.add(label, 0);
				SpriteIcon red = new SpriteIcon("red.png");
				red.setGridLocation(i, x);
				l.add(red, 0);
				players[i][x] = label;
			}
		}
		l.add(selector, 0);
		//remove(players[0][0]);
		
		/*ImageLabel red = new ImageLabel("red.png");
		l.add(red, 0);
		red.setImageSize(700, 700);*/
	}
	private void redrawSelector() {
		selector.setGridLocation(selectorx, selectory);
	}
}