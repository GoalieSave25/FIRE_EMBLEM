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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Custom Start");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 43));
		lblNewLabel.setBounds(174, 11, 277, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblChooseACharacter = new JLabel("Choose a character to start the game.");
		lblChooseACharacter.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblChooseACharacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseACharacter.setBounds(191, 64, 243, 14);
		contentPane.add(lblChooseACharacter);
		
		JButton myrmidon = new JButton(new ImageIcon("1.gif"));
		myrmidon.setBounds(50, 101, 97, 87);
		contentPane.add(myrmidon);
		
		JButton mage = new JButton(new ImageIcon("2.gif"));
		mage.setBounds(194, 101, 97, 87);
		contentPane.add(mage);
		
		JButton thief = new JButton(new ImageIcon("3.gif"));
		thief.setBounds(338, 101, 97, 87);
		contentPane.add(thief);
		
		JButton cavalier = new JButton(new ImageIcon("4.gif"));
		cavalier.setBounds(482, 101, 97, 87);
		contentPane.add(cavalier);
		
		JButton knight = new JButton(new ImageIcon("5.gif"));
		knight.setBounds(50, 242, 97, 87);
		contentPane.add(knight);
		
		JButton fighter = new JButton(new ImageIcon("6.gif"));
		fighter.setBounds(194, 242, 97, 87);
		contentPane.add(fighter);
		
		JButton mercenary = new JButton(new ImageIcon("7.gif"));
		mercenary.setBounds(338, 242, 97, 87);
		contentPane.add(mercenary);
		
		JButton archer = new JButton(new ImageIcon("8.gif"));
		archer.setBounds(482, 242, 97, 87);
		contentPane.add(archer);
		
		JLabel lblmyrmidon = new JLabel("Myrmidon");
		lblmyrmidon.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblmyrmidon.setHorizontalAlignment(SwingConstants.CENTER);
		lblmyrmidon.setBounds(50, 188, 97, 23);
		contentPane.add(lblmyrmidon);
		
		JLabel lblmage = new JLabel("Mage");
		lblmage.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblmage.setHorizontalAlignment(SwingConstants.CENTER);
		lblmage.setBounds(194, 188, 97, 23);
		contentPane.add(lblmage);
		
		JLabel lblKnight = new JLabel("Knight");
		lblKnight.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblKnight.setHorizontalAlignment(SwingConstants.CENTER);
		lblKnight.setBounds(50, 330, 97, 23);
		contentPane.add(lblKnight);
		
		JLabel lblFighter = new JLabel("Fighter");
		lblFighter.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblFighter.setHorizontalAlignment(SwingConstants.CENTER);
		lblFighter.setBounds(194, 330, 97, 23);
		contentPane.add(lblFighter);
		
		JLabel lblMercenary = new JLabel("Mercenary");
		lblMercenary.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblMercenary.setHorizontalAlignment(SwingConstants.CENTER);
		lblMercenary.setBounds(338, 330, 97, 23);
		contentPane.add(lblMercenary);
		
		JLabel lblThief = new JLabel("Thief");
		lblThief.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblThief.setHorizontalAlignment(SwingConstants.CENTER);
		lblThief.setBounds(338, 188, 97, 23);
		contentPane.add(lblThief);
		
		JLabel lblCavalier = new JLabel("Cavalier");
		lblCavalier.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblCavalier.setHorizontalAlignment(SwingConstants.CENTER);
		lblCavalier.setBounds(482, 188, 97, 23);
		contentPane.add(lblCavalier);
		
		JLabel lblArcher = new JLabel("Archer");
		lblArcher.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblArcher.setHorizontalAlignment(SwingConstants.CENTER);
		lblArcher.setBounds(482, 330, 97, 23);
		contentPane.add(lblArcher);
		
		JButton btnBack = new JButton("Return to Main Menu");
		btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
				new menu1().setVisible(true);
			}
		});
		btnBack.setBounds(50, 382, 187, 23);
		contentPane.add(btnBack);
		
	}
}
