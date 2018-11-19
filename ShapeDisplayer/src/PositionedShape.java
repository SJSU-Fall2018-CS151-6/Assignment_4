import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class PositionedShape
{
    private Point2D position;
    private CompositeShape shape;

    public PositionedShape(Point2D paramPoint2D, CompositeShape paramCompositeShape)
    {
        position = paramPoint2D;
        shape = paramCompositeShape;
    }


    public void draw(Graphics2D paramGraphics2D)
    {
        AffineTransform localAffineTransform = paramGraphics2D.getTransform();
        paramGraphics2D.translate(position.getX(), position.getY());
        shape.draw(paramGraphics2D);
        paramGraphics2D.setTransform(localAffineTransform);
    }
}

