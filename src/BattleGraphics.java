import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class BattleGraphics extends JFrame {

	private JPanel contentPane;
	private JLabel labelAttacker, labelDefender;
	private JTextArea textArea;
	private static Unit unitOne;
	private static Unit unitTwo;

	/**
	 * Launch the application.
	 */
	public BattleGraphics(Battle battle)
	{
		setIconImage(new ImageIcon("icon.jpg").getImage());
		setTitle("Fire Emblem - Battle");
		unitOne = battle.getAttacker();
		unitTwo = battle.getDefender();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		setBounds((int)(width/2-450/2), (int)(height/2-300/2), 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReturn = new JButton("RETURN TO MAP");
		btnReturn.setBounds(0, 239, 433, 23);
		btnReturn.setFocusPainted(false);
		btnReturn.setBackground(new Color(210, 180, 140));
		btnReturn.setFont(new Font("Papyrus", Font.BOLD, 10));
		contentPane.add(btnReturn);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(20, 185, 404, 70);
		textArea.setEditable(false);
		textArea.setHighlighter(null);
		textArea.setFont(new Font("Papyrus", Font.BOLD, 10));
		textArea.setForeground(Color.WHITE);
		contentPane.add(textArea);
		
		labelAttacker = new JLabel(unitOne.getImageAlways());
		labelAttacker.setText(unitOne.getHP() +"");
		labelAttacker.setBounds(10, 103, 80, 63);
		contentPane.add(labelAttacker);
		
		labelDefender = new JLabel(unitTwo.getImageAlways());
		labelDefender.setText(unitTwo.getHP() +"");
		labelDefender.setBounds(344, 103, 80, 63);
		contentPane.add(labelDefender);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("Chara GIFs/bg-battle.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 439, 262);
		contentPane.add(lblNewLabel);
		btnReturn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) 
		{
			dispose();
		}});
		
	}
	/**
	 * Create the frame.
	 */
	public BattleGraphics() {
		setIconImage(new ImageIcon("icon.jpg").getImage());
		setTitle("Fire Emblem - Battle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReturn = new JButton("RETURN TO MAP");
		btnReturn.setBounds(0, 239, 433, 23);
		btnReturn.setFocusPainted(false);
		btnReturn.setBackground(new Color(210, 180, 140));
		btnReturn.setFont(new Font("Papyrus", Font.BOLD, 12));
		contentPane.add(btnReturn);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(20, 167, 404, 95);
		textArea.setFont(new Font("Papyrus", Font.BOLD, 10));
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		JLabel labelAttacker = new JLabel(unitOne.getImageAlways());
		labelAttacker.setBounds(10, 103, 80, 63);
		contentPane.add(labelAttacker);
		
		JLabel labelDefender = new JLabel(unitOne.getImageAlways());
		labelDefender.setBounds(344, 103, 80, 63);
		contentPane.add(labelDefender);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("bg-battle.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 439, 262);
		contentPane.add(lblNewLabel);
	}
	public void textArea(String text)
	{
		textArea.setText(text);
		labelDefender.setText(unitTwo.getHP() +"");
		labelAttacker.setText(unitOne.getHP() +"");
	}
}
