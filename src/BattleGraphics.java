import java.awt.BorderLayout;
import java.awt.EventQueue;
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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleGraphics frame = new BattleGraphics(new Battle(unitOne, unitTwo));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public BattleGraphics(Battle battle)
	{
		unitOne = battle.getAttacker();
		unitTwo = battle.getDefender();
		setTitle("Battle!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReturn = new JButton("RETURN TO MAP");
		btnReturn.setBounds(0, 239, 433, 23);
		contentPane.add(btnReturn);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(20, 177, 404, 85);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		labelAttacker = new JLabel(unitOne.getImageAlways());
		labelAttacker.setText(unitOne.getHP() +"");
		labelAttacker.setBounds(10, 103, 80, 63);
		contentPane.add(labelAttacker);
		
		labelDefender = new JLabel(unitTwo.getImageAlways());
		labelDefender.setText(unitTwo.getHP() +"");
		labelDefender.setBounds(344, 103, 80, 63);
		contentPane.add(labelDefender);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("bg-battle.jpg"));
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
		setTitle("Battle!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReturn = new JButton("RETURN TO MAP");
		btnReturn.setBounds(0, 239, 433, 23);
		contentPane.add(btnReturn);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(20, 177, 404, 85);
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
