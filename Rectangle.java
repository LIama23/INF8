
import java.awt.*;

public class Rectangle extends Figure 
{

    public Rectangle(Color color, int x, int y, int w, int h) 
    {
        super(color, x, y, w, h);
    }

    public void draw(Graphics g) 
    {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }
}