
import javax.swing.*;
import java.awt.*;
  
/**
 * A class to make working with a color chooser easier
 * for students.  It uses a JColorChooser to let the user
 * pick a color and returns the chosen color object.
 * 
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class DrawingEditor
{
  private ControlPanel control;
  private DrawingPanel canvas;
  
  private int WINDOW_HEIGHT = 1000;
  private int WINDOW_LENGTH = 1000;
  /**
   * Method to let the user pick a color and return
   * the color object. 
   * @return the picked color or red if no color was picked
   */
  public static DrawingEditor()
  {
      this.setTitle("Drawing Editor");
      DrawingPanel canvas = newDrawingPanel();
      ControlPanel control = newControlPanel(canvas);
      
      this.setLayout(new BorderLayout());
      this.add(controls, (BorderLayout.SOUTH));
      this.add(canvas, BorderLayout.CENTER);
      
      this.setSize(WINDOW_LENGTH, WINDOW_HEIGHT);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
  }
  
  public static void main(String[] args)
  {
      DrawingEditor editor = new DrawingEditor();
  }
}
