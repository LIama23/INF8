import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure
{

    int r;

    public Circle(Color c, int mx, int my, int r)
    {
        super(c, mx, my);
        this.r = r;
    }

    @Override
    public void draw(Graphics g) 
    {


    }
    
}
