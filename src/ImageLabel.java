import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends JLabel {
	private int x = 0;
	private int y = 0;
	private int width = 50;
	private int height = 50;
	private String path = "";
	
	public ImageLabel(String filepath) {
		super();
		path = filepath;
		Image img = new ImageIcon(filepath).getImage();
		img = img.getScaledInstance(50, 50, 0);
		super.setIcon(new ImageIcon(img));
		super.setBounds(0, 0, 50, 50);
	}
	public ImageLabel(String filepath, int x, int y, int width, int height) {
		super();
		path = filepath;
		Image img = new ImageIcon(filepath).getImage();
		img = img.getScaledInstance(width, height, 0);
		super.setIcon(new ImageIcon(img));
		super.setBounds(x, y, width, height);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	private void resetImage() {
		Image img = new ImageIcon(path).getImage();
		img = img.getScaledInstance(width, height, 0);
		super.setIcon(new ImageIcon(img));
		super.setBounds(x, y, width, height);
	}
	public void setX(int x) {
		this.x = x;
		resetImage();
	}
	public void setY(int y) {
		this.y = y;
		resetImage();
	}
	public void setWidth(int width) {
		this.width = width;
		resetImage();
	}
	public void setHeight(int height) {
		this.height = height;
		resetImage();
	}
	public void setPath(String filepath) {
		this.path = filepath;
		resetImage();
	}
	public void setImageBounds(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		resetImage();
	}
	public void setImageLocation(int x, int y) {
		this.x = x;
		this.y = y;
		resetImage();
	}
	public void setImageSize(int width, int height) {
		this.width = width;
		this.height = height;
		resetImage();
	}
}