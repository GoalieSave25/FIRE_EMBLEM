import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SpriteIcon extends JLabel {
	private int x = 0;
	private int y = 0;
	private String path = "";
	private final double imageSize = 58.9;
	private int width = 0;
	private int height = 0;
	private double origwidth = 20;
	private double origheight = 20;
	private int widthoffset = 2;
	private int heightoffset = 3;
	private ImageIcon img;
	
	public SpriteIcon(String filepath) {
		super();
		path = filepath;
		ImageIcon icon = new ImageIcon(filepath);
		Image img = icon.getImage();
		width = (int)(imageSize+0.6)-5;
		height = (int)(imageSize-0.3)-5;
		if(origwidth > origheight) {
			img = img.getScaledInstance(width, (int) ((origheight/origwidth)*height), 0);
			height = (int) ((origheight/origwidth)*height);
		} else {
			img = img.getScaledInstance((int) ((origwidth/origheight)*width), height, 0);
			width = (int) ((origwidth/origheight)*width);
		}
		this.img = new ImageIcon(img);
		super.setIcon(new ImageIcon(img));
		x = (int)((imageSize+0.6)*x)+widthoffset;
		y = (int)((imageSize-0.3)*y)+heightoffset;
		super.setIcon(new ImageIcon(img));
		super.setBounds(x, y, width, height);
	}
	
	public SpriteIcon(ImageIcon img) {
		super();
		ImageIcon icon = img;
		Image img1 = icon.getImage();
		width = (int)(imageSize+0.6)-5;
		height = (int)(imageSize-0.3)-5;
		if(origwidth > origheight) {
			img1 = img1.getScaledInstance(width, (int) ((origheight/origwidth)*height), 0);
			height = (int) ((origheight/origwidth)*height);
		} else {
			img1 = img1.getScaledInstance((int) ((origwidth/origheight)*width), height, 0);
			width = (int) ((origwidth/origheight)*width);
		}
		this.img = new ImageIcon(img1);
		super.setIcon(new ImageIcon(img1));
		x = (int)((imageSize+0.6)*x)+widthoffset;
		y = (int)((imageSize-0.3)*y)+heightoffset;
		super.setIcon(new ImageIcon(img1));
		super.setBounds(x, y, width, height);
	}
	
	public SpriteIcon(String filepath, int x, int y) {
		super();
		path = filepath;
		Image img = new ImageIcon(filepath).getImage();
		width = (int)(imageSize+0.6)-5;
		height = (int)(imageSize-0.3)-5;
		if(origwidth > origheight) {
			img = img.getScaledInstance(width, (int) ((origheight/origwidth)*height), 0);
			height = (int) ((origheight/origwidth)*height);
		} else {
			img = img.getScaledInstance((int) ((origwidth/origheight)*width), height, 0);
			width = (int) ((origwidth/origheight)*width);
		}
		super.setIcon(new ImageIcon(img));
		x = (int)((imageSize+0.6)*x)+widthoffset;
		y = (int)((imageSize-0.3)*y)+heightoffset;
		super.setBounds(x, y, width, height);
		this.x = x;
		this.y = y;
	}
	private void resetImage() {
		Image img = new ImageIcon(path).getImage();
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
	public ImageIcon getImg() {
		return img;
	}
}