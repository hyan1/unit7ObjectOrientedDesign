

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock2
{
    int secret1;
    int secret2;
    int secret3;
    int dial;
    boolean opened1;
    boolean opened2;
    boolean opened3;
    public ComboLock2(int secret1, int secret2, int secret3)
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    
    public void reset()
    {
        dial = 0;
    }
    
    public void turnLeft(int ticks)
    {
        if (!opened1)
        {
            if( ticks == secret1 )
            {
                opened1 = true;
            }
        }
        else
        {
            if ( ticks == secret3 )
            {
                opened3 = true;
            }
        }
    }
    
    public void turnRight( int ticks)
    {
        if( ticks == secret2)
        {
            opened2 = true;
        }
    }
    
    
    
    public boolean open()
    {
        if(opened1 && opened2 && opened3 == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
