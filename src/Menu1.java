import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class Menu1 extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		//new AudioPlayer("My_Heart.wav");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu1 frame = new Menu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Menu1() {
		setIconImage(new ImageIcon("icon.jpg").getImage());
		String[][] a = new String[10][20];
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 20; y++) {
				a[x][y] = "";
			}
		}
		for(int x = 0; x < 10; x++)
			a[x][x] = "PERSON";
		//Grid grid = new Grid(a);
		setResizable(false);
		setTitle("Fire Emblem - Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds((int)(width/2-835/2), (int)(height/2-520/2), 835, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JButton btnQuickStart = new JButton("Quick Start");
		btnQuickStart.setFocusPainted(false);
		btnQuickStart.setBackground(new Color(210, 180, 140));
		btnQuickStart.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnQuickStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				contentPane.setVisible(false);
				dispose();
				Characters a = new Characters(true);
				Characters b = new Characters(false);
				new FEGrid(a, b);
			}
		});
		btnQuickStart.setBounds(10, 259, 150,100);
		contentPane.add(btnQuickStart);
		
		JButton btnCustomStart = new JButton("Custom");
		btnCustomStart.setFocusPainted(false);
		btnCustomStart.setBackground(new Color(210, 180, 140));
		btnCustomStart.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnCustomStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu2();
				dispose();
			}
		});
		btnCustomStart.setBounds(10, 370, 150,100);
		contentPane.add(btnCustomStart);
		
		JButton btnEmulator = new JButton("Emulator");
		btnEmulator.setFocusPainted(false);
		btnEmulator.setBackground(new Color(210, 180, 140));
		btnEmulator.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnEmulator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					openWebpage(new URL("https://www.loveroms.com/play-online/gameboy-advance/fire-emblem-u-/45270"));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		});
		btnEmulator.setBounds(659, 259, 150,100);
		contentPane.add(btnEmulator);
		
		JButton btnRagenquit = new JButton("Exit");
		btnRagenquit.setFocusPainted(false);
		btnRagenquit.setBackground(new Color(210, 180, 140));
		btnRagenquit.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnRagenquit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnRagenquit.setBounds(659, 370, 150,100);
		contentPane.add(btnRagenquit);
		
		JButton btnHowPlay = new JButton("How to Play");
		btnHowPlay.setFocusPainted(false);
		btnHowPlay.setBackground(new Color(210, 180, 140));
		btnHowPlay.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnHowPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Menu3();
			}
		});
		btnHowPlay.setBounds(195, 425, 429, 45);
		contentPane.add(btnHowPlay);
		
		ImageLabel logo = new ImageLabel("logo.png", 50, 50, 735, 150);
		contentPane.add(logo);
		ImageLabel bg = new ImageLabel("background.png", -1, -1, 835, 520);
		contentPane.add(bg);
	}
	public static void openWebpage(java.net.URI uri) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static void openWebpage(URL url) {
	    try {
	        openWebpage(url.toURI());
	    } catch (URISyntaxException e) {
	        e.printStackTrace();
	    }
	}
}
