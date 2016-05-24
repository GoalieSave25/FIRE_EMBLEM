import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

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
	String[] image = new String[] {"empty", "1", "2", "3", "4", "5", "6", "7", "10", "9", "10", "11", "12", "13", "14", "15", "16", "17", "110", "19", "17", "21", "22", "23", "24", "blue"};
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
					for(int k = 0; k < 17; k++)
					{
						for(int l = 0; l < 10; l++)
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
					for(int k = 0; k < 17; k++)
					{
						for(int l = 0; l < 10; l++)
						{
							if(it.getUnit().friendly() != grid[k][l].getUnit().friendly() && grid[k][l].getUnit().getPerson()&& !grid[k][l].getUnit().getAttack() && Math.abs(k - it.getJX()) + Math.abs(it.getJY() - l) <= it.getUnit().getWeapon().getRng())
							{
								grid[k][l].setIcon(new ImageIcon("Chara GIFs/" + (Integer.parseInt(grid[k][l].getUnit().getPic()) + 12) + ".gif"));
								grid[k][l].getUnit().setPic((Integer.parseInt(grid[k][l].getUnit().getPic()) + 12) + "");
								grid[k][l].setRed();
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
					for(int k = 0; k < 17; k++)
					{
						for(int l = 0; l < 10; l++)
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
								grid[k][l].setRed();
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
					
					for(int k = 0; k < 17; k++)
						for(int l = 0; l < 10; l++)
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
					for(int k = 0; k < 17; k++)
					{
						for(int l = 0; l < 10; l++)
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
					
					for(int k = 0; k < 17; k++)
					{
						for(int l = 0; l < 10; l++)
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
				for(int k = 0; k < 17; k++)
				{
					for(int l = 0; l < 10; l++)
					{
						if(grid[k][l].getUnit().getPerson() && grid[k][l].getUnit().friendly() == turn && !grid[k][l].getUnit().getAlreadyatt())
							cont = true;
					}
				}
				if(!cont && moving() == null && attacking() == null)
				{
					turn = !turn;
					for(int k = 0; k < 17; k++)
					{
						for(int l = 0; l < 10; l++)
						{
							grid[k][l].getUnit().setAlreadyatt(false);
							grid[k][l].getUnit().setAlreadymov(false);
							grid[k][l].getUnit().setAttack(false);
						}
					}
				}
			if(turn && attacking() == null)
				frame.setTitle("Fire Emblem - Player 1 Turn");
			else if(turn)
				frame.setTitle("Fire Emblem - Player 1 Attacking");
			else if(!turn && attacking() == null)
				frame.setTitle("Fire Emblem - Player 2 Turn");
			else
				frame.setTitle("Fire Emblem - Player 2 Attacking");
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
				for(int k = 0; k < 17; k++)
				{
					for(int l = 0; l < 10; l++)
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
				for(int k = 0; k < 17; k++)
				{
					for(int l = 0; l < 10; l++)
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
				for(int k = 0; k < 17; k++)
				{
					for(int l = 0; l < 10; l++)
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
		frame = new JFrame("Fire Emblem - Player 1 Turn");
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
		grid = new JLabel2[17][10];
		turn = true;
		
		for(int x = 0; x < 17; x++)
		{
			for(int y = 0; y < 10; y++)
			{
				if((6 < x && x < 11) && y < 2 && count < 8)
				{
					grid[x][y] = new JLabel2(new Unit[] {a.getUnit(count)}, x, y, "player");
					count++;
				}
				else if((6 < x && x < 11) && y > 7 && count2 < 8)
				{
					grid[x][y] = new JLabel2(new Unit[] {b.getUnit(count2)}, x, y, "player");
					count2++;
				}
				else
				{
					grid[x][y] = new JLabel2(new Unit[] {new Unit(0,0,0,0,0,0,0,0,0, new Weapon(0,0,0,0, "placeholder"), new ImageIcon("Chara GIFs/empty.gif"), false, false, "empty")}, x, y, "empty");
				}
				
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
	
	/*private ImageIcon tint(ImageIcon loadImgs, Color color) {
		BufferedImage loadImg = (BufferedImage) loadImgs.getImage();
		
	    BufferedImage img = new BufferedImage(loadImg.getWidth(), loadImg.getHeight(),
	            BufferedImage.TRANSLUCENT);
	    final float tintOpacity = 0.45f;
	    Graphics2D g2d = img.createGraphics(); 

	    //Draw the base image
	    g2d.drawImage(loadImg, null, 0, 0);
	    //Set the color to a transparent version of the input color
	    g2d.setColor(new Color(color.getRed() / 255f, color.getGreen() / 255f, 
	        color.getBlue() / 255f, tintOpacity));

	    //Iterate over every pixel, if it isn't transparent paint over it
	    Raster data = loadImg.getData();
	    for(int x = data.getMinX(); x < data.getWidth(); x++){
	        for(int y = data.getMinY(); y < data.getHeight(); y++){
	            int[] pixel = data.getPixel(x, y, new int[4]);
	            if(pixel[3] > 0){ //If pixel isn't full alpha. Could also be pixel[3]==255
	                g2d.fillRect(x, y, 1, 1);
	            }
	        }
	    }
	    g2d.dispose();
	    return new ImageIcon(img);
	}*/
}