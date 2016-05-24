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
	private Unit[] players = new Unit[8];
	private Unit[] enemies = new Unit[8];
	private Characters baseCharacters = new Characters(true);
	private Characters base2Characters = new Characters(false);
	private Unit darkMage1 = new Unit(25,19,24,16,19,18,19,22,5, new Weapon(11,1,60,1,"Arcthunder"), new ImageIcon("Chara GIFs/11.gif"), true, true, "11");
	private Unit darkMage2 = new Unit(25,19,24,16,19,18,19,22,5, new Weapon(11,1,60,1,"Arcthunder"), new ImageIcon("Chara GIFs/11.gif"), true, false, "11");
	private Unit savage1 = new Unit(45,24,19,16, 20, 17,23,18, 5, new Weapon(14,1,65,1,"Steel Axe"), new ImageIcon("Chara GIFs/9.gif"), true, true, "9");
	private Unit savage2 = new Unit(45,24,19,16, 20, 17,23,18, 5, new Weapon(14,1,65,1,"Steel Axe"), new ImageIcon("Chara GIFs/9.gif"), true, false, "9");
	private JButton myrmidon, mage, thief, cavalier, knight, fighter, mercenary, archer, darkMage, savage;
	private int counter;
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
		setBounds(100, 100, 641, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Custom Start");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 43));
		lblNewLabel.setBounds(174, 11, 277, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblChooseACharacter = new JLabel("Choose Team 1");
		lblChooseACharacter.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblChooseACharacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseACharacter.setBounds(191, 64, 243, 14);
		contentPane.add(lblChooseACharacter);
		
		JButton myrmidon = new JButton(new ImageIcon("Chara GIFs/1.gif"));
		myrmidon.setBounds(50, 101, 97, 87);
		contentPane.add(myrmidon);
		myrmidon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				myrmidon.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(0);
				else if( counter < 15)
					enemies[counter - 8] = base2Characters.getUnit(0);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		mage = new JButton(new ImageIcon("Chara GIFs/2.gif"));
		mage.setBounds(194, 101, 97, 87);
		contentPane.add(mage);
		mage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				mage.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(1);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(1);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		thief = new JButton(new ImageIcon("Chara GIFs/3.gif"));
		thief.setBounds(338, 101, 97, 87);
		contentPane.add(thief);
		thief.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				thief.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(2);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(2);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		cavalier = new JButton(new ImageIcon("Chara GIFs/4.gif"));
		cavalier.setBounds(482, 101, 97, 87);
		contentPane.add(cavalier);
		cavalier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				cavalier.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(3);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(3);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		knight = new JButton(new ImageIcon("Chara GIFs/5.gif"));
		knight.setBounds(50, 242, 97, 87);
		contentPane.add(knight);
		knight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				knight.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(4);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(4);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		fighter = new JButton(new ImageIcon("Chara GIFs/6.gif"));
		fighter.setBounds(194, 242, 97, 87);
		contentPane.add(fighter);
		fighter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				fighter.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(5);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(5);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		mercenary = new JButton(new ImageIcon("Chara GIFs/7.gif"));
		mercenary.setBounds(338, 242, 97, 87);
		contentPane.add(mercenary);
		mercenary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				mercenary.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(6);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(6);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
		archer = new JButton(new ImageIcon("Chara GIFs/8.gif"));
		archer.setBounds(482, 242, 97, 87);
		contentPane.add(archer);
		archer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				archer.setVisible(false);
				if(counter < 8)
					players[counter] = baseCharacters.getUnit(7);
				else if( counter < 16)
					enemies[counter - 8] = base2Characters.getUnit(7);
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		savage = new JButton(new ImageIcon("Chara GIFs/9.gif"));
		savage.setBounds(342, 382, 97, 87);
		contentPane.add(savage);
		savage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				savage.setVisible(false);
				if(counter < 8)
					players[counter] = savage1;
				else if( counter < 16)
					enemies[counter - 8] = savage2;
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		darkMage = new JButton(new ImageIcon("Chara GIFs/11.gif"));
		darkMage.setBounds(482, 382, 97, 87);
		contentPane.add(darkMage);
		darkMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				darkMage.setVisible(false);
				if(counter < 8)
					players[counter] = darkMage1;
				else if( counter < 16)
					enemies[counter - 8] = darkMage2;
				if(counter == 15)
				{
					
					dispose();
					new FEGrid(new Characters(players[0], players[1],players[2],players[3],players[4],players[5],players[6],players[7]), new Characters(enemies[0], enemies[1],enemies[2],enemies[3],enemies[4],enemies[5],enemies[6],enemies[7]));
				}
				else if( counter == 7)
				{ 
					myrmidon.setVisible(true);
					mage.setVisible(true);
					knight.setVisible(true);
					fighter.setVisible(true);
					mercenary.setVisible(true);
					thief.setVisible(true);
					archer.setVisible(true);
					cavalier.setVisible(true);
					darkMage.setVisible(true);
					savage.setVisible(true);
				}
				counter ++;
			}
		});
		
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
				new Menu1().setVisible(true);
			}
		});
		btnBack.setBounds(50, 382, 187, 23);
		contentPane.add(btnBack);
		
	}
	private void setAllVisible(boolean visible)
	{
		myrmidon.setVisible(visible);
		mage.setVisible(visible);
		knight.setVisible(visible);
		fighter.setVisible(visible);
		mercenary.setVisible(visible);
		thief.setVisible(visible);
		archer.setVisible(visible);
		cavalier.setVisible(visible);
		darkMage.setVisible(visible);
		savage.setVisible(visible);
	}
}
