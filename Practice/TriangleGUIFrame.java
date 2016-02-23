import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class TrangleGUIFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleGUIFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private TriangleGUIComponent scene;
    
    
    
    /**
     * Default constructor for objects of class TrangleGUIFrame 
     */
    public TriangleGUIFrame()
    {
        scene = new TriangleComponent();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        
    }
}
