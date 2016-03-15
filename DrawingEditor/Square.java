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
    }

    public boolean isInside(Point2D.Double point)
    {
        if(Math.sqrt(Math.pow(getCenter().getX()-point.getX(),2)+Math.pow(getCenter().getY()-point.getY(),2))<getRadius())
        {
            return true;
        }
        else
        {
            return false;
        }
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
        Rectangle2D.Double square = new Rectangle2D.Double(getCenter().getX()-getRadius(), getCenter().getY()-getRadius(), 2*getRadius(), 2*getRadius());
        g2.setColor(super.getColor());
        if(filled==true)
        {
            g2.fill(square);
        }
        else
        {
            g2.draw(square);
        }
    }
}

