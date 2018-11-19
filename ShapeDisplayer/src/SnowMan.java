import java.awt.geom.*;

public class SnowMan extends CompositeShape
{
    private Ellipse2D.Double face;
    private Ellipse2D.Double body;

    public SnowMan(int paramInt1, int paramInt2, int paramInt3)
    {
        super(paramInt1, paramInt2);
        face = new Ellipse2D.Double(getX(), getY(), paramInt3, paramInt3);
        body = new Ellipse2D.Double(getX(), getY() + paramInt3, paramInt3, paramInt3);
        add(face);
        add(body);
    }
}

