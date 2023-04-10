
import java.awt.*;


public abstract class Figure 
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
	
	public Figure(Color color, int x, int y) 
    {
		this.color = color;
		this.x = x;
		this.y = y;

	}


	public abstract void draw(Graphics g);
}