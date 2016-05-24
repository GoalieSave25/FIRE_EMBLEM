import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class FEGrid
{
	JLabel2[][] grid;
	JFrame frame;
	JLayeredPane display = new JLayeredPane();
	boolean turn;
	final Unit[] empty = new Unit[] {new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty")};
	String[] image = new String[] {"empty", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "blue"};
		private class Listen implements MouseListener
		{
			public Listen()//, Character[] k)
			{}
			public void mouseClicked(MouseEvent e) 
			{
				JLabel2 it = (JLabel2)e.getComponent();
				if(it.getUnit().friendly() == turn && it.getExt().equals("player") && moving() == null && attacking() == null && it.getUnit().getPerson() && !it.getUnit().getAlreadymov() && !it.getUnit().getAlreadyatt())
				{
					it.setExt("moving");
					for(int k = 0; k < 20; k++)
					{
						for(int l = 0; l < 8; l++)
						{
							if(Math.abs(k - it.getJX()) + Math.abs(it.getJY()-l) <= it.getUnit().getMovement() && grid[k][l].getExt().equals("empty"))
							{
								grid[k][l].setText("bl");
								grid[k][l].getUnit().setPic("blue");
								grid[k][l].getUnit().setImage(new ImageIcon("blue.png"));
								grid[k][l].setBlue();
								grid[k][l].setExt("move");
							}
						}
					}
				}
				else if(it.getUnit().friendly() == turn && it.getExt().equals("player") && moving() == null && attacking() == null && it.getUnit().getPerson() && !it.getUnit().getAlreadyatt())//attack phase(change alreadyatt to true)
				{
					it.getUnit().setAlreadyatt(true);
					it.getUnit().setAttack(true);
					it.getUnit().setAlreadymov(true);
					for(int k = 0; k < 20; k++)
					{
						for(int l = 0; l < 8; l++)
						{
							if(it.getUnit().friendly() != grid[k][l].getUnit().friendly() && grid[k][l].getUnit().getPerson()&& !grid[k][l].getUnit().getAttack() && Math.abs(k - it.getJX()) + Math.abs(it.getJY() - l) <= it.getUnit().getWeapon().getRng())
							{
								grid[k][l].setIcon(new ImageIcon("Chara GIFs/" + (Integer.parseInt(grid[k][l].getUnit().getPic()) + 12) + ".gif"));
								grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) + 12) + "");
								grid[k][l].getUnit().setImage((ImageIcon) grid[k][l].getIcon());
								grid[k][l].setExt("attackable");
							}
						}
					}
				}
				else if(it.getExt().equals("moving"))
				{
					it.getUnit().setAlreadyatt(true);
					it.getUnit().setAttack(true);
					it.getUnit().setAlreadymov(true);
					for(int k = 0; k < 20; k++)
					{
						for(int l = 0; l < 8; l++)
						{
							if(grid[k][l].getExt().equals("move"))
							{
								grid[k][l].getUnit().setPic(image[0]);
								grid[k][l].getUnit().setImage(new ImageIcon("Chara GIFs/empty.gif"));
								grid[k][l].setIcon(grid[k][l].getUnit().getImage());
								grid[k][l].setText("  ");
								grid[k][l].setExt("empty");
							}
							else if(it.getUnit().friendly() != grid[k][l].getUnit().friendly() && Math.abs(k - it.getJX()) + Math.abs(it.getJY() - l) <= it.getUnit().getWeapon().getRng())
							{
								grid[k][l].setIcon(new ImageIcon("Chara GIFs/" + (Integer.parseInt(grid[k][l].getUnit().getPic()) + 12) + ".gif"));
								grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) + 12) + "");
								grid[k][l].getUnit().setImage((ImageIcon) grid[k][l].getIcon());
								grid[k][l].setExt("attackable");
							}
						}
					}
					if(it.getUnit().friendly())
						it.setText("p1");
					else
						it.setText("p2");
					it.setExt("player");
				}
				
				
				if(it.getExt().equals("move"))
				{
					JLabel2 the = moving();
					the.getUnit().setAlreadymov(true);
					
					it.setUnit(the.getUnit());
					it.getUnit().setPic(the.getUnit().getPic());
					it.getUnit().setImage(the.getUnit().getImage());
					it.setIcon(it.getUnit().getImage());
					the.setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty")); //= new JLabel2(new Unit[] {new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty")}, the.getJX(), the.getJY(), "empty");
					the.setIcon(the.getUnit().getImage());
					the.setText("  ");
					the.setExt("empty");
					
					if(it.getUnit().friendly())
						it.setText("p1");
					else
						it.setText("p2");
					it.setExt("player");
					
					for(int k = 0; k < 20; k++)
						for(int l = 0; l < 8; l++)
							if(grid[k][l].getExt().equals("move"))
							{
								grid[k][l].setText("  ");
								grid[k][l].setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty"));
								
								grid[k][l].setIcon(grid[k][l].getUnit().getImage());
								grid[k][l].setExt("empty");
							}
				}
				
				if(attacking() != null && it.getExt().equals("empty"))
				{
					attacking().getUnit().setAttack(false);
					for(int k = 0; k < 20; k++)
					{
						for(int l = 0; l < 8; l++)
						{
							if(grid[k][l].getExt().equals("attackable"))
							{
								if(grid[k][l].getUnit().friendly())
								{
									grid[k][l].setText("p1");
									grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) - 12) + "");
									grid[k][l].getUnit().setImage(new ImageIcon("Chara GIFs/" + grid[k][l].getUnit().getPic() + ".gif"));
									grid[k][l].setRed();
								}
								else
								{
									grid[k][l].setText("p2");
									grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) - 12) + "");
									grid[k][l].getUnit().setImage(new ImageIcon("Chara GIFs/" + grid[k][l].getUnit().getPic() + ".gif"));
									grid[k][l].setRed();
								}
								
								grid[k][l].setExt("player");
							}
						}
					}
				}
				
				if(it.getExt().equals("attackable"))
				{
					Battle bat = new Battle(attacking().getUnit(), it.getUnit());
					bat.battle();
					JLabel2 the = attacking();
					if(attacking().getUnit().getHP() <= 0)
					{
						System.out.println("dead off");
						the.setText("  ");
						the.setExt("empty");
						the.setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty"));
						the.setIcon(the.getUnit().getImage());
						
					}
					if(it.getUnit().getHP() <= 0)
					{
						System.out.println("dead def");
						it.setText("  ");
						it.setExt("empty");
						it.setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty"));
						it.setIcon(it.getUnit().getImage());
					}
					
					alive();
					
					for(int k = 0; k < 20; k++)
					{
						for(int l = 0; l < 8; l++)
						{
							if(grid[k][l].getExt().equals("attackable"))
							{
								if(grid[k][l].getUnit().friendly())
								{
									grid[k][l].setText("p1");
									grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) - 12) + "");
									grid[k][l].getUnit().setImage(new ImageIcon("Chara GIFs/" + grid[k][l].getUnit().getPic() + ".gif"));
									grid[k][l].setIcon(grid[k][l].getUnit().getImage());
								}
								else
								{
									grid[k][l].setText("p2");
									grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) - 12) + "");
									grid[k][l].getUnit().setImage(new ImageIcon("Chara GIFs/" + grid[k][l].getUnit().getPic() + ".gif"));
									grid[k][l].setIcon(grid[k][l].getUnit().getImage());
								}
								
								grid[k][l].setExt("player");
							}
						}
					}
					the.getUnit().setAttack(false);
				}
				
				boolean cont = false;
				for(int k = 0; k < 20; k++)
				{
					for(int l = 0; l < 8; l++)
					{
						if(grid[k][l].getUnit().getPerson() && grid[k][l].getUnit().friendly() == turn && !grid[k][l].getUnit().getAlreadyatt())
							cont = true;
					}
				}
				if(!cont && moving() == null && attacking() == null)
				{
					turn = !turn;
					for(int k = 0; k < 20; k++)
					{
						for(int l = 0; l < 8; l++)
						{
							grid[k][l].getUnit().setAlreadyatt(false);
							grid[k][l].getUnit().setAlreadymov(false);
							grid[k][l].getUnit().setAttack(false);
						}
					}
				}
			if(turn && attacking() == null)
				frame.setTitle("Test Grid - p1");
			else if(turn)
				frame.setTitle("Test Grid - p1, attacking");
			else if(!turn && attacking() == null)
				frame.setTitle("Test Grid - p2");
			else
				frame.setTitle("Test Grid - p2, attacking");
			}

			
			public void mouseEntered(MouseEvent e) 
			{}
			public void mouseExited(MouseEvent e) 
			{}
			public void mousePressed(MouseEvent e) 
			{}	
			public void mouseReleased(MouseEvent e) 
			{}
			
			private JLabel2 moving()
			{
				for(int k = 0; k < 20; k++)
				{
					for(int l = 0; l < 8; l++)
					{
						if(grid[k][l].getExt().equals("moving"))
						{
							return grid[k][l];
						}
								
					}
				}
				return null;
			}
			
			private JLabel2 attacking()
			{
				for(int k = 0; k < 20; k++)
				{
					for(int l = 0; l < 8; l++)
					{
						if(grid[k][l].getUnit().getPerson() && grid[k][l].getUnit().getAttack())
								return grid[k][l];
					}
				}
				return null;
			}
			
			private void alive()
			{
				boolean aliveF = false;
				boolean aliveE = false;
				for(int k = 0; k < 20; k++)
				{
					for(int l = 0; l < 8; l++)
					{
						if(grid[k][l].getUnit().friendly() && grid[k][l].getUnit().getPerson())
							aliveF = true;
						if(!grid[k][l].getUnit().friendly() && grid[k][l].getUnit().getPerson())
							aliveE = true;
					}
				}
				if(aliveF && !aliveE)
					end(1);
				else if(!aliveF && aliveE)
					end(2);
				else if(!aliveF && !aliveE)
					end(0);
			}
		}
		
		class JLabel2 extends CharacterIcon
		{
			private String ext;
			private Unit[] has;
			private int x;
			private int y;
			public JLabel2( Unit[] b, int z, int v, String e)
			{
				super(b[0].getPic(), z, v);
				has = b;
				x = z;
				y = v;
				ext = e;
				if(has[0].friendly() && has[0].getPerson())
					this.setText("p1");
				else if(!has[0].friendly() && has[0].getPerson())
					this.setText("p2");
				else
					this.setText("  ");
			}
			
			public Unit getUnit()
			{
				return has[0];
			}
			
			public void setUnit(Unit a)
			{
				has[0] = a;
			}
			public int getJX()
			{
				return x;
			}
			public int getJY()
			{
				return y;
			}
			
			public void setExt(String a)
			{
				ext = a;
			}
			
			public String getExt()
			{
				return ext;
			}
			
			public void setIcon(ImageIcon icon) {
				super.setIcon(new CharacterIcon(has[0].getPic()).getImg());
			}
			
			public void setBlue() {
				super.setIcon(new SpriteIcon("blue.png").getImg());
			}
			
			public void setRed() {
				super.setIcon(new SpriteIcon("red.png").getImg());
			}
		}
		
	public FEGrid(Characters a, Characters b)
	{
		frame = new JFrame("Test Grid - p1");
		frame.setIconImage(new ImageIcon("icon.jpg").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		frame.setBounds((int)(width/2-1000/2), (int)(height/2-600/2), 1017, 613);
		frame.setContentPane(display);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		turn = true;
		int count = 0;
		int count2 = 0;
		ImageLabel bg = new ImageLabel("battlescene.png");
		display.add(bg, 0);
		bg.setImageSize(1011, 640);
		grid = new JLabel2[20][10];
		turn = true;
		
		for(int x = 0; x < 20; x++)
		{
			for(int y = 0; y < 8; y++)
			{
				if((7 < x && x < 12) && y < 2)
				{
					grid[x][y] = new JLabel2(new Unit[] {a.getUnit(count)}, x, y, "player");
					count++;
				}
				else if((7 < x && x < 12) && y > 5)
				{
					grid[x][y] = new JLabel2(new Unit[] {b.getUnit(count2)}, x, y, "player");
					count2++;
				}
				else
				{
					grid[x][y] = new JLabel2(new Unit[] {new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty")}, x, y, "empty");
				}
				//grid[x][y].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
				
				grid[x][y].addMouseListener(new Listen());
				display.add(grid[x][y],0);
			}
		}
		frame.setContentPane(display);
		frame.setVisible(true);
	}
	
	private void end(int p)
	{
		String infoMessage = "";
		if(p == 1)
			infoMessage = "Player 1 wins";
		else if(p == 2)
			infoMessage = "Player 2 wins";
		else if(p == 0)
			infoMessage = "Tie";
		
		JOptionPane.showMessageDialog(null, infoMessage, "Game Over", JOptionPane.INFORMATION_MESSAGE);
		
		frame.setVisible(false);
		frame.dispose();
	}
	
}