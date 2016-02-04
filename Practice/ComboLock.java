
/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    int secret1;
    int secret2;
    int secret3;
    int dial;
    boolean opened1;
    boolean opened2;
    boolean opened3;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        this.dial = 0;
        this.opened1 = false;
        this.opened2 = false;
        this.opened3 = false;
    }

    public void reset()
    {
        dial = 0;
        opened1 = false;
        opened2 = false;
        opened3 = false;
    }

    public void turnLeft(int ticks)
    {
        dial-=ticks;
        checkValid();

        opened2 = checkSecret2();
    }

    public void turnRight( int ticks)
    {
        dial+=ticks;
        checkValid();

        opened1 = checkSecret1();
        opened3 = checkSecret3();
        
    }

    public void checkValid()
    {
        while (dial<0 || dial>40)
        {
            if (dial > 40)
            {
                dial-=40;
            }
            else if (dial < 0)
            {
                dial+=40;
            }
            else
            {
                System.out.println("This should never happen. Dial has gone inbetween 0 and 40 immediately after a while loop sentinel check");
            }
        }
    }

    public boolean checkSecret1()
    {
        if (dial == secret1)
        {
            return true;
        }
        return false;
    }

    public boolean checkSecret2()
    {
        if (opened1)
        {
            if (dial == secret2)
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkSecret3()
    {
        if (opened1 && opened2)
        {
            if (dial == secret3)
            {
                return true;
            }
        }
        return false;
    }

    public boolean open()
    {
        if(opened1 && opened2 && opened3 == true)
        {
            return true;
        }
        return false;
    }
}
