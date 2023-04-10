import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Figure
{
    int x1, y1, x2, x3, y2, y3;

    Triangle (Color c, int x1, int y1, int x2, int y2, int x3, int y3)
    {
        super(c, x1, y1);
        this.x2 = x2;
        this.x3 = x3;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public void draw(Graphics g) 
    {
        
        int xpoints[] = {x, x2, x3};
        int ypoints[] = {y, y2, y3};
        g.drawPolygon(xpoints, ypoints, 3);
        g.fillPolygon(xpoints, ypoints, 3);

    }
    
}
