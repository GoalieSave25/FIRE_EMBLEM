import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;	
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid {
	private int gridx = 0;
	private int gridy = 0;
	JLabel2[][] grid;
	JFrame frame;
	JPanel display;
		private class Listen {
			public String kind;
			public int x;
			public int y;
			public int temp;
			public boolean moving;
			//Character[] chara = new Character[1];
			public Listen(String a, int b, int c, int d)//, Character[] k)
			{
				kind = a;
				x = b;
				y = c;
				temp = d;
				moving = false;
				//kinds include characters, empty, moveable
				//chara = k;
			}
			
			/*public void mouseClicked(MouseEvent e) 
			{
				JLabel2 it = (JLabel2)e.getComponent();
				if(it.getText().equals("PERSON") && moving() == null && attacking() == null && it.getUnit().getPerson() && !it.getUnit().getAlreadymov() && !it.getUnit().getAlreadyatt())
				{
					it.setText("moving");
					
					for(int k = 0; k < gridx; k++)
					{
						for(int l = 0; l < gridy; l++)
						{
							if(Math.abs(k - it.getJX()) + Math.abs(it.getJY()-l) <= it.getUnit().getMovement() && grid[k][l].getText().equals(""))
							{
								grid[k][l].setText("move");
							}
						}
					}
				}
				else if(it.getText().equals("PERSON") && moving() == null && attacking() == null && it.getUnit().getPerson() && !it.getUnit().getAlreadyatt())//attack phase(change alreadyatt to true)
				{
					it.getUnit().setAlreadyatt(true);
					it.getUnit().setAttack(true);
					it.getUnit().setAlreadymov(true);
					for(int k = 0; k < gridx; k++)
					{
						for(int l = 0; l < gridy; l++)
						{
							if(grid[k][l].getUnit().getPerson()&& !grid[k][l].getUnit().getAttack() && Math.abs(k - it.getJX()) + Math.abs(it.getJY() - l) <= it.getUnit().getWeapon().getRng())
							{
								grid[k][l].setText("attackable");
							}
						}
					}
				}
				else if(it.getText().equals("moving"))
				{
					it.getUnit().setAlreadyatt(true);
					it.getUnit().setAttack(true);
					it.getUnit().setAlreadymov(true);
					for(int k = 0; k < gridx; k++)
					{
						for(int l = 0; l < gridy; l++)
						{
							if(grid[k][l].getText().equals("move"))
							{
								grid[k][l].setText("");
							}
							else if(//*grid[k][l].getUnit().getPerson()&& !grid[k][l].getUnit().getAttack() && //Math.abs(k - it.getJX()) + Math.abs(it.getJY() - l) <= it.getUnit().getWeapon().getRng())
							{
								grid[k][l].setText("attackable");
							}
						}
					}
					it.setText("PERSON");
				}
				
				
				if(it.getText().equals("move"))
				{
					JLabel2 the = moving();
					the.getUnit().setAlreadymov(true);
					
					it.setUnit(the.getUnit());
					the.setText("");
					the.setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,1,0,0, "placeholder"), null, false));
					it.setText("PERSON");
								
					for(int k = 0; k < gridx; k++)
						for(int l = 0; l < gridy; l++)
							if(grid[k][l].getText().equals("move"))
								grid[k][l].setText("");
				}
				
				if(it.getText().equals("attackable"))
				{
					Battle bat = new Battle(attacking().getUnit(), it.getUnit());
					bat.battle();
					JLabel2 the = attacking();
					if(attacking().getUnit().getHP() <= 0)
					{
						the.getUnit().setAlreadyatt(false);
						the.getUnit().setAlreadymov(false);
						the.setText("");
						the.setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,1,0,0, "placeholder"), null, false));
					}
					if(it.getUnit().getHP() <= 0)
					{
						it.setText("");
						it.getUnit().setAlreadyatt(false);
						it.getUnit().setAlreadymov(false);
						it.setUnit(new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,1,0,0, "placeholder"), null, false));
					}
					
					for(int k = 0; k < gridx; k++)
						for(int l = 0; l < gridy; l++)
							if(grid[k][l].getText().equals("attackable"))
								grid[k][l].setText("PERSON");
					the.getUnit().setAttack(false);
				}
					
				//}
				//if(it.getText().equals("moving") && !moving() && !attacking() )//attack phase
				//{
					
				//}
				
				
			}

			
			public void mouseEntered(MouseEvent e) 
			{}
			public void mouseExited(MouseEvent e) 
			{}
			public void mousePressed(MouseEvent e) 
			{}	
			public void mouseReleased(MouseEvent e) 
			{}
			*/
			private JLabel2 moving()
			{
				for(int k = 0; k < gridx; k++)
				{
					for(int l = 0; l < gridy; l++)
					{
						//Listen[] a = (Listen[]) grid[k][l].getMouseListeners();
						//if(a[0].moving)
							//return true;
						if(grid[k][l].getText().equals("moving"))
								return grid[k][l];
					}
				}
				return null;
			}
			
			private JLabel2 attacking()
			{
				for(int k = 0; k < gridx; k++)
				{
					for(int l = 0; l < gridy; l++)
					{
						if(grid[k][l].getUnit().getPerson() && grid[k][l].getUnit().getAttack())
								return grid[k][l];
					}
				}
				return null;
			}
			
		}
		
		class JLabel2
		{
			private Unit[] has;
			private int x;
			private int y;
			private String a;
			public JLabel2(String a, Unit[] b, int z, int v)
			{
				this.a = a;
				has = b;
				x = z;
				y = v;
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
			public String getText() {
				return a;
			}
		}
		
	public Grid(String[][] the) {
		gridx = the.length;
		gridy = the[0].length;
		//frame = new JFrame("test grid");
		//display = new JPanel(new GridLayout(gridx, gridy));
		grid = new JLabel2[gridx][gridy];
		for(int x = 0; x < gridx; x++)
		{
			for(int y = 0; y < gridy; y++)
			{
				if(the[x][y].equals("PERSON"))
					grid[x][y] = new JLabel2(the[x][y], new Unit[] {new Unit(10, 1, 1, 1, 1, 1, 1, 1, 5, new Weapon(1,5,5,5,"string"), null, true)}, x, y);
				else
					grid[x][y] = new JLabel2(the[x][y], new Unit[] {new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), null, false)}, x, y);
				//grid[x][y].setBorder(BorderFactory.createMatteBorder(1, 5, 1, 1, Color.BLACK));
				
				//grid[x][y].addMouseListener(new Listen(the[x][y], x, y, 5));
				//display.add(grid[x][y]);
			}
		}
		//frame.setContentPane(display);
		//frame.pack();
		//frame.setVisible(true);	
	}	
}