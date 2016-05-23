import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class Menu2 extends JFrame {
	private JPanel contentPane;
	public Menu2() {
		setIconImage(new ImageIcon("icon.jpg").getImage());
		setResizable(false);
		setTitle("Fire Emblem - Character Select");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds((int)(width/2-641/2), (int)(height/2-466/2), 641, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setForeground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Custom Start");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Papyrus", Font.BOLD, 43));
		lblNewLabel.setBounds(153, 11, 318, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblChooseACharacter = new JLabel("Choose a character to start the game.");
		lblChooseACharacter.setFont(new Font("Papyrus", Font.BOLD, 12));
		lblChooseACharacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseACharacter.setBounds(181, 64, 263, 26);
		contentPane.add(lblChooseACharacter);
		
		JButton myrmidon = new JButton(new ImageIcon("Chara GIFs/1.gif"));
		myrmidon.setFocusPainted(false);
		myrmidon.setBackground(new Color(210, 180, 140));
		myrmidon.setBounds(50, 101, 97, 87);
		myrmidon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("1");
			}
		});
		contentPane.add(myrmidon);
		
		JButton mage = new JButton(new ImageIcon("Chara GIFs/2.gif"));
		mage.setFocusPainted(false);
		mage.setBackground(new Color(210, 180, 140));
		mage.setBounds(194, 101, 97, 87);
		mage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("2");
			}
		});
		contentPane.add(mage);
		
		JButton thief = new JButton(new ImageIcon("Chara GIFs/3.gif"));
		thief.setFocusPainted(false);
		thief.setBackground(new Color(210, 180, 140));
		thief.setBounds(338, 101, 97, 87);
		thief.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("3");
			}
		});
		contentPane.add(thief);
		
		JButton cavalier = new JButton(new ImageIcon("Chara GIFs/4.gif"));
		cavalier.setFocusPainted(false);
		cavalier.setBackground(new Color(210, 180, 140));
		cavalier.setBounds(482, 101, 97, 87);
		cavalier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("4");
			}
		});
		contentPane.add(cavalier);
		
		JButton knight = new JButton(new ImageIcon("Chara GIFs/5.gif"));
		knight.setFocusPainted(false);
		knight.setBackground(new Color(210, 180, 140));
		knight.setBounds(50, 242, 97, 87);
		knight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("5");
			}
		});
		contentPane.add(knight);
		
		JButton fighter = new JButton(new ImageIcon("Chara GIFs/6.gif"));
		fighter.setFocusPainted(false);
		fighter.setBackground(new Color(210, 180, 140));
		fighter.setBounds(194, 242, 97, 87);
		fighter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("6");
			}
		});
		contentPane.add(fighter);
		
		JButton mercenary = new JButton(new ImageIcon("Chara GIFs/7.gif"));
		mercenary.setFocusPainted(false);
		mercenary.setBackground(new Color(210, 180, 140));
		mercenary.setBounds(338, 242, 97, 87);
		mercenary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("7");
			}
		});
		contentPane.add(mercenary);
		
		JButton archer = new JButton(new ImageIcon("Chara GIFs/8.gif"));
		archer.setFocusPainted(false);
		archer.setBackground(new Color(210, 180, 140));
		archer.setBounds(482, 242, 97, 87);
		archer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Main("8");
			}
		});
		contentPane.add(archer);
		
		JLabel lblmyrmidon = new JLabel("Myrmidon");
		lblmyrmidon.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblmyrmidon.setHorizontalAlignment(SwingConstants.CENTER);
		lblmyrmidon.setBounds(50, 188, 97, 23);
		contentPane.add(lblmyrmidon);
		
		JLabel lblmage = new JLabel("Mage");
		lblmage.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblmage.setHorizontalAlignment(SwingConstants.CENTER);
		lblmage.setBounds(194, 188, 97, 23);
		contentPane.add(lblmage);
		
		JLabel lblKnight = new JLabel("Knight");
		lblKnight.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblKnight.setHorizontalAlignment(SwingConstants.CENTER);
		lblKnight.setBounds(50, 330, 97, 23);
		contentPane.add(lblKnight);
		
		JLabel lblFighter = new JLabel("Fighter");
		lblFighter.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblFighter.setHorizontalAlignment(SwingConstants.CENTER);
		lblFighter.setBounds(194, 330, 97, 23);
		contentPane.add(lblFighter);
		
		JLabel lblMercenary = new JLabel("Mercenary");
		lblMercenary.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblMercenary.setHorizontalAlignment(SwingConstants.CENTER);
		lblMercenary.setBounds(338, 330, 97, 23);
		contentPane.add(lblMercenary);
		
		JLabel lblThief = new JLabel("Thief");
		lblThief.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblThief.setHorizontalAlignment(SwingConstants.CENTER);
		lblThief.setBounds(338, 188, 97, 23);
		contentPane.add(lblThief);
		
		JLabel lblCavalier = new JLabel("Cavalier");
		lblCavalier.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblCavalier.setHorizontalAlignment(SwingConstants.CENTER);
		lblCavalier.setBounds(482, 188, 97, 23);
		contentPane.add(lblCavalier);
		
		JLabel lblArcher = new JLabel("Archer");
		lblArcher.setFont(new Font("Papyrus", Font.PLAIN, 12));
		lblArcher.setHorizontalAlignment(SwingConstants.CENTER);
		lblArcher.setBounds(482, 330, 97, 23);
		contentPane.add(lblArcher);
		
		JButton btnBack = new JButton("Return to Main Menu");
		btnBack.setFocusPainted(false);
		btnBack.setFont(new Font("Papyrus", Font.PLAIN, 14));
		btnBack.setBackground(new Color(210, 180, 140));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Menu1().setVisible(true);
			}
		});
		btnBack.setBounds(50, 382, 187, 33);
		contentPane.add(btnBack);
		
	}
}
