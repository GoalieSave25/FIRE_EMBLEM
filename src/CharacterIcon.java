import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CharacterIcon extends JLabel {
	private int x = 0;
	private int y = 0;
	private String path = "";
	private final double imageSize = 58.9;
	private int width = 0;
	private int height = 0;
	private double origwidth = 20;
	private double origheight = 20;
	private int widthoffset = 0;
	private int heightoffset = 0;
	
	public CharacterIcon(String name) {
		super();
		if(name.equals("1")) {
			origwidth = 32;
			origheight = 33;
		} else if(name.equals("2")) {
			origwidth = 20;
			origheight = 28;
		}
		else if(name.equals("3")) {
			origwidth = 21;
			origheight = 26;
		}
		else if(name.equals("4")) {
			origwidth = 27;
			origheight = 31;
		}
		else if(name.equals("5")) {
			origwidth = 27;
			origheight = 28;
		}
		else if(name.equals("6")) {
			origwidth = 24;
			origheight = 25;
		}
		else if(name.equals("7")) {
			origwidth = 23;
			origheight = 26;
		}
		else if(name.equals("8")) {
			origwidth = 17;
			origheight = 28;
		}
		else if(name.equals("9")) {
			origwidth = 22;
			origheight = 23;
		}
		else if(name.equals("10")) {
			origwidth = 26;
			origheight = 20;
		}
		else if(name.equals("11")) {
			origwidth = 18;
			origheight = 23;
		}
		else if(name.equals("12")) {
			origwidth = 29;
			origheight = 28;
		}
		path = name;
		ImageIcon icon = new ImageIcon("Chara GIFs/" + name + ".gif");
		Image img = icon.getImage();
		width = (int)(imageSize+0.6);
		height = (int)(imageSize-0.3);
		if(origwidth > origheight) {
			img = img.getScaledInstance(width, (int) ((origheight/origwidth)*height), 0);
			height = (int) ((origheight/origwidth)*height);
			widthoffset = 0;
			heightoffset = (int) ((imageSize-0.3-height)/2);
		} else {
			img = img.getScaledInstance((int) ((origwidth/origheight)*width), height, 0);
			width = (int) ((origwidth/origheight)*width);
			heightoffset = 0;
			widthoffset = (int) ((imageSize+0.6-width)/2);
		}
		super.setIcon(new ImageIcon(img));
		x = (int)((imageSize+0.6)*x)+widthoffset;
		y = (int)((imageSize-0.3)*y)+heightoffset;
		super.setIcon(new ImageIcon(img));
		super.setBounds(x, y, width, height);
	}
	public CharacterIcon(String name, int x, int y) {
		super();
		if(name.equals("1")) {
			origwidth = 32;
			origheight = 33;
		} else if(name.equals("2")) {
			origwidth = 20;
			origheight = 28;
		}
		else if(name.equals("3")) {
			origwidth = 21;
			origheight = 26;
		}
		else if(name.equals("4")) {
			origwidth = 27;
			origheight = 31;
		}
		else if(name.equals("5")) {
			origwidth = 27;
			origheight = 28;
		}
		else if(name.equals("6")) {
			origwidth = 24;
			origheight = 25;
		}
		else if(name.equals("7")) {
			origwidth = 23;
			origheight = 26;
		}
		else if(name.equals("8")) {
			origwidth = 17;
			origheight = 28;
		}
		else if(name.equals("9")) {
			origwidth = 22;
			origheight = 23;
		}
		else if(name.equals("10")) {
			origwidth = 26;
			origheight = 20;
		}
		else if(name.equals("11")) {
			origwidth = 18;
			origheight = 23;
		}
		else if(name.equals("12")) {
			origwidth = 29;
			origheight = 28;
		}
		path = name;
		Image img = new ImageIcon("Chara GIFs/" + name + ".gif").getImage();
		width = (int)(imageSize+0.6);
		height = (int)(imageSize-0.3);
		if(origwidth > origheight) {
			img = img.getScaledInstance(width, (int) ((origheight/origwidth)*height), 0);
			height = (int) ((origheight/origwidth)*height);
			widthoffset = 0;
			heightoffset = (int) ((imageSize-0.3-height)/2);
		} else {
			img = img.getScaledInstance((int) ((origwidth/origheight)*width), height, 0);
			width = (int) ((origwidth/origheight)*width);
			heightoffset = 0;
			widthoffset = (int) ((imageSize+0.6-width)/2);
		}
		super.setIcon(new ImageIcon(img));
		x = (int)((imageSize+0.6)*x)+widthoffset;
		y = (int)((imageSize-0.3)*y)+heightoffset;
		super.setBounds(x, y, width, height);
		this.x = x;
		this.y = y;
	}
	private void resetImage() {
		Image img = new ImageIcon("Chara GIFs/" + path + ".gif").getImage();
		img = img.getScaledInstance(width, height, 0);
		super.setIcon(new ImageIcon(img));
		super.setBounds(x, y, width, height);
	}
	public void setX(int x) {
		x = (int)((imageSize+0.6)*x)+widthoffset;
		this.x = x;
		resetImage();
	}
	public void setY(int y) {
		y = (int)((imageSize-0.3)*y)+heightoffset;
		this.y = y;
		resetImage();
	}
	public void setPath(String name) {
		this.path = name;
		resetImage();
	}
	public void setGridLocation(int x, int y) {
		this.x = (int)((imageSize+0.6)*x)+widthoffset;
		this.y = (int)((imageSize-0.3)*y)+heightoffset;
		resetImage();
	}
}