import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure
{

    int r;

    public Circle(Color c, int mx, int my, int r)
    {
        super(c, mx, my, my, r);
        this.r = r;
    }

    @Override
    public void draw(Graphics g) 
    {

        g.drawOval(x, y, r/2, r/2);
        g.fillOval(x, y, r/2, r/2);

    }
    
}
