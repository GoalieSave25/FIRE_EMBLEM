import javax.swing.ImageIcon;

public class Unit extends Stats
{
	Weapon weapon;
	private boolean attack;
	private boolean alreadyatt;
	private boolean alreadymov;
	private boolean person;
	private boolean friendly;
	private ImageIcon sprite;
	private ImageIcon battleSprite;
	private String pic;
	
	public Unit (int HP, int STRENGTH, int MAGIC, int SKILL, int SPEED, int LUCK, int DEFENSE, int RESISTANCE, int MOVEMENT, Weapon weapn, ImageIcon image, boolean p, boolean f, String im)
    {
		super(HP, STRENGTH, MAGIC, SKILL, SPEED, LUCK, DEFENSE, RESISTANCE, MOVEMENT);
		weapon = weapn;
		attack = false;
		alreadyatt = false;
		alreadymov = false;
		person = p;
		friendly = f;
		sprite = image;
		battleSprite = image;
		pic = im;
    }
	
	//add getHP
	public int getDmg()
	{
		return getStrength() + weapon.getDmg();
	}
	public Weapon getWeapon()
	{
		return weapon;
	}
	public int getLuck()
	{
		return super.getLuck() + (int) weapon.getCrit();
	}
	
	public void setAttack(boolean a)
	{
		attack = a;
	}
	public boolean getAttack()
	{
		return attack;
	}
	public void setAlreadyatt(boolean a)
	{
		alreadyatt = a;
	}
	public boolean getAlreadyatt()
	{
		return alreadyatt;
	}
	public void setAlreadymov(boolean a)
	{
		alreadymov = a;
	}
	public boolean getAlreadymov()
	{
		return alreadymov;
	}
	public boolean getPerson()
	{
		return person;
	}
	
	public boolean friendly()
	{
		return friendly;
	}
	
	public ImageIcon getImage()
	{
		return sprite;
	}
	
	public void setImage(ImageIcon a)
	{
		sprite = a;
	}
	public ImageIcon getImageAlways()
	{
		return battleSprite;
	}
	
	public String getPic()
	{
		return pic;
	}
	
	public void setPic(String a)
	{
		pic = a;
	}
}
