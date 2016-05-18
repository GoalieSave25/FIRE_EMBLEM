import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		contentPane.add(lblFireEmblem);
		
		JButton btnQuickStart = new JButton("Quick Start");
		btnQuickStart.setBounds(74, 155, 229, 129);
		contentPane.add(btnQuickStart);
		
		JButton button = new JButton("Quick Start");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(381, 155, 229, 129);
		contentPane.add(button);
	}
}
