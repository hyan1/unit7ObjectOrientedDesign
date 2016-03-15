import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle2D.Double square;

    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        square = new Rectangle2D.Double(center.getX(), center.getY(), radius, radius);
    }

    public boolean isInside(Point2D.Double point)
    {
        square = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        return square.contains(point);
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        square = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        double compare = super.getRadius() * .95;
        Rectangle2D.Double compareSquare = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), compare, compare);
        return square.contains(point) && !compareSquare.contains(point);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        square = new Rectangle2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        g2.draw(square);
        g2.setColor(super.getColor());
        if (filled)
        {
            g2.fill(square);
        }
    }
}

