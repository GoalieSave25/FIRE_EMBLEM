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

public class Menu3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu3 frame = new Menu3();
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
	public Menu3() {
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 486, 257);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel instructionsLabel = new JLabel("Select the character you want to move. They can move anywhere in the blue ");
		instructionsLabel.setFont(new Font("Papyrus", Font.PLAIN, 13));
		instructionsLabel.setVerticalAlignment(SwingConstants.TOP);
		instructionsLabel.setBounds(17, 75, 443, 28);
		contentPane.add(instructionsLabel);
		
		JButton backButton = new JButton("Back to Main Menu");
		backButton.setFont(new Font("Papyrus", Font.BOLD, 12));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
				dispose();
				
				new Menu1().setVisible(true);
			
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
