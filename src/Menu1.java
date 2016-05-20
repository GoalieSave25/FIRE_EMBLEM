import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xerces.internal.util.URI;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Menu1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Menu1() {
		setResizable(false);
		setTitle("Fire Emblem - Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuickStart = new JButton("Quick Start");
		btnQuickStart.setBackground(new Color(210, 180, 140));
		btnQuickStart.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnQuickStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				contentPane.setVisible(false);
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Main frame = new Main();
							frame.setVisible(true);
							frame.setResizable(false);
							frame.setTitle("GIF Viewer");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnQuickStart.setBounds(10, 259, 150,100);
		contentPane.add(btnQuickStart);
		
		JButton btnCustomStart = new JButton("Custom");
		btnCustomStart.setBackground(new Color(210, 180, 140));
		btnCustomStart.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnCustomStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
				new Menu2().setVisible(true);
			}
		});
		btnCustomStart.setBounds(10, 370, 150,100);
		contentPane.add(btnCustomStart);
		
		JButton btnEmulator = new JButton("Emulator");
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
		btnHowPlay.setBackground(new Color(210, 180, 140));
		btnHowPlay.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnHowPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Menu3().setVisible(true);
			}
		});
		btnHowPlay.setBounds(195, 425, 429, 45);
		contentPane.add(btnHowPlay);
		
		ImageLabel logo = new ImageLabel("logo.png", 50, 50, 735, 150);
		contentPane.add(logo);
		ImageLabel bg = new ImageLabel("Background.png", -1, -1, 835, 520);
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
