
import java.awt.*;

import javax.swing.JFrame;


public abstract class Figure extends JFrame
{
	protected int x, y, w, h;
	protected Color color;
	
	public Figure(Color color, int x, int y, int w, int h) 
    {
		this.color = color;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	



	public abstract void draw(Graphics g);
}