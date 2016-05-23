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

public class Menu3 extends JFrame {
	private JPanel contentPane;
	public Menu3() {
		setIconImage(new ImageIcon("icon.jpg").getImage());
		setTitle("Fire Emblem - Help");
		setResizable(false);
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds((int)(width/2-486/2), (int)(height/2-257/2), 486, 257);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setForeground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel instructionsLabel = new JLabel("Select the character you want to move. They can move anywhere in the blue ");
		instructionsLabel.setFont(new Font("Papyrus", Font.PLAIN, 13));
		instructionsLabel.setVerticalAlignment(SwingConstants.TOP);
		instructionsLabel.setBounds(17, 75, 443, 28);
		contentPane.add(instructionsLabel);
		
		JButton backButton = new JButton("Back to Main Menu");
		backButton.setFocusPainted(false);
		backButton.setBackground(new Color(210, 180, 140));
		backButton.setFont(new Font("Papyrus", Font.BOLD, 12));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Menu1();
			}
		});
		backButton.setBounds(143, 133, 193, 53);
		contentPane.add(backButton);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelp.setFont(new Font("Papyrus", Font.PLAIN, 49));
		lblHelp.setBounds(166, 11, 146, 53);
		contentPane.add(lblHelp);
		
		JLabel lblNewLabel = new JLabel(" shaded area.  When in range of an enemy, select them to attack.");
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 13));
		lblNewLabel.setBounds(17, 90, 402, 28);
		contentPane.add(lblNewLabel);
	}
}
