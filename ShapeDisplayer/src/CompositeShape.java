import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;


public class CompositeShape implements CompositeShapeInt
{
    private int x;
    private int y;
    private ArrayList<Shape> shapes;

    public CompositeShape(int paramInt1, int paramInt2)
    {
        x = paramInt1;
        y = paramInt2;
        shapes = new ArrayList(); }

    public int getX() { return x; }
    public int getY() { return y; }



    public void add(Shape paramShape)
    {
        shapes.add(paramShape);
    }

    public Rectangle getBounds()
    {
        if (shapes.size() == 0) return new Rectangle();
        Shape localShape = (Shape)shapes.get(0);
        Rectangle localRectangle = localShape.getBounds();
        for (int i = 1; i < shapes.size(); i++)
        {
            localShape = (Shape)shapes.get(i);
            localRectangle = localRectangle.union(localShape.getBounds());
        }
        return localRectangle;
    }

    public void draw(Graphics2D paramGraphics2D) {
        for (int i = 0; i < shapes.size(); i++)
            paramGraphics2D.draw((Shape)shapes.get(i));
    }

    public void translate(int paramInt1, int paramInt2) { x += paramInt1;
        y += paramInt2;
    }
}
