import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu2 frame = new Menu2();
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
	public Menu2() {
		setTitle("Character Select");
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setForeground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JButton myrmidon = new JButton(new ImageIcon("1.gif"));
		myrmidon.setBackground(new Color(210, 180, 140));
		myrmidon.setBounds(50, 101, 97, 87);
		/*myrmidon.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				contentPane.removeAll();
				contentPane.setVisible(false);
				dispose();
				EventQueue.invokeLater(new Runnable() 
				{
					public void run() 
					{
						try 
						{
							Main frame = new Main();
							frame.setVisible(true);
							frame.setResizable(false);
							frame.setTitle("GIF Viewer");
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				});
			}
		});*/
		contentPane.add(myrmidon);
		
		JButton mage = new JButton(new ImageIcon("2.gif"));
		mage.setBackground(new Color(210, 180, 140));
		mage.setBounds(194, 101, 97, 87);
		contentPane.add(mage);
		
		JButton thief = new JButton(new ImageIcon("3.gif"));
		thief.setBackground(new Color(210, 180, 140));
		thief.setBounds(338, 101, 97, 87);
		contentPane.add(thief);
		
		JButton cavalier = new JButton(new ImageIcon("4.gif"));
		cavalier.setBackground(new Color(210, 180, 140));
		cavalier.setBounds(482, 101, 97, 87);
		contentPane.add(cavalier);
		
		JButton knight = new JButton(new ImageIcon("5.gif"));
		knight.setBackground(new Color(210, 180, 140));
		knight.setBounds(50, 242, 97, 87);
		contentPane.add(knight);
		
		JButton fighter = new JButton(new ImageIcon("6.gif"));
		fighter.setBackground(new Color(210, 180, 140));
		fighter.setBounds(194, 242, 97, 87);
		contentPane.add(fighter);
		
		JButton mercenary = new JButton(new ImageIcon("7.gif"));
		mercenary.setBackground(new Color(210, 180, 140));
		mercenary.setBounds(338, 242, 97, 87);
		contentPane.add(mercenary);
		
		JButton archer = new JButton(new ImageIcon("8.gif"));
		archer.setBackground(new Color(210, 180, 140));
		archer.setBounds(482, 242, 97, 87);
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
		btnBack.setFont(new Font("Papyrus", Font.PLAIN, 14));
		btnBack.setBackground(new Color(210, 180, 140));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
				new Menu1().setVisible(true);
			}
		});
		btnBack.setBounds(50, 382, 187, 23);
		contentPane.add(btnBack);
		
	}
}
