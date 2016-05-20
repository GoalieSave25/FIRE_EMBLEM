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

public class menu1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu1 frame = new menu1();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menu1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFireEmblem = new JLabel("FIRE EMBLEM");
		lblFireEmblem.setBounds(5, 5, 709, 139);
		lblFireEmblem.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
		lblFireEmblem.setHorizontalAlignment(SwingConstants.CENTER);
		lblFireEmblem.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblFireEmblem);
		
		JButton btnQuickStart = new JButton("Quick Start");
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
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnQuickStart.setBounds(40, 155, 150,100);
		contentPane.add(btnQuickStart);
		
		JButton btnCustomStart = new JButton("Custom");
		btnCustomStart.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnCustomStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCustomStart.setBounds(40, 270, 150,100);
		contentPane.add(btnCustomStart);
		
		
		
		JButton btnEmulator = new JButton("Emulator");
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
		btnEmulator.setBounds(530, 155, 150,100);
		contentPane.add(btnEmulator);
		
		
		
		JButton btnRagenquit = new JButton("EXIT");
		btnRagenquit.setFont(new Font("Papyrus", Font.PLAIN, 20));
		btnRagenquit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnRagenquit.setBounds(530, 270, 150,100);
		contentPane.add(btnRagenquit);
		
		JButton btnHowPlay = new JButton("HOW TO PLAY");
		btnHowPlay.setFont(new Font("Papyrus", Font.PLAIN, 32));
		btnHowPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
				new Menu3().setVisible(true);
				/*try {
					openWebpage(new URL("http://fireemblem.wikia.com/wiki/Fire_Emblem_Wiki:Basics"));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			*/}
		});
		btnHowPlay.setBounds(200, 425, 362, 45);
		contentPane.add(btnHowPlay);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(38, 55, 745, 389);
		lblNewLabel.setIcon(new ImageIcon("fe.jpg"));
		contentPane.add(lblNewLabel);
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
