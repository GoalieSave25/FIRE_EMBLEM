import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Game extends JPanel 
{
    private SceneManager sceneControl;
    
    public Game(SceneManager sm)
    {
        sceneControl = sm;
        //boot it up
        setLayout(null);
        setSize(Grid.WIDTH, Grid.HEIGHT);
        setLocation(0, 0);
        setPreferredSize(new Dimension(Grid.WIDTH, Grid.HEIGHT));
        setVisible(true);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        sceneControl.draw(g2);
    }
    
}